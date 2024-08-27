package hus.oop.designpatterns.strategy.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByPayPal implements PayStrategy {
    private DatabaseForPayPal databaseForPayPal = DatabaseForPayPal.getInstance();
    private final BufferedReader READER =
                        new BufferedReader(new InputStreamReader(System.in));
    private String passWord;
    private String email;
    private boolean signedIn;

    public boolean verify() {
        setSignedIn(email.equals(databaseForPayPal.getDataBase().get(passWord)));
        return signedIn;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (verify()) {
            System.out.println("paying " + paymentAmount + " using paypal");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("enter your email: ");
                email = READER.readLine();
                System.out.println("enter your password: ");
                passWord = READER.readLine();
                if (verify()) {
                    System.out.println("data verification has been successful");
                } else {
                    System.out.println("wrong email or password");
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
