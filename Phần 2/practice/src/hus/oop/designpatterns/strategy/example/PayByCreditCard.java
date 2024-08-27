package hus.oop.designpatterns.strategy.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    public final BufferedReader READER =
                            new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("paying " + paymentAmount + " using credit card");
            creditCard.setAmount(creditCard.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("enter the card number: ");
            String number = READER.readLine();
            System.out.println("enter the card expiration date mm/yy: ");
            String date = READER.readLine();
            System.out.println("enter the card verification value code: ");
            String cardVerificationValue = READER.readLine();

            if (CreditCardValidator.isValid(number)) {
                creditCard = new CreditCard(number, date, cardVerificationValue);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public boolean cardIsPresent() {
        return creditCard != null;
    }
}
