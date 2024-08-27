package hus.oop.design_patterns.lab10.strategy.pay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByPaypal implements PayStrategy {
    private static final DataBase dataBase = DataBase.getInstance();
    private final BufferedReader READER
            = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using paypal");
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetail() {
        try {
            System.out.println("Enter the user's email: ");
            email = READER.readLine();
            System.out.println("Enter the password: ");
            password = READER.readLine();

            if (verify()) {
                System.out.println("Data verification has been successfully.");
            } else {
                System.out.println("Wrong email or password");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(dataBase.DATA_BASE.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
