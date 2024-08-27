package hus.oop.design_patterns.lab10.strategy.pay;

public class CreditCard {
    private int amount;
    private final String number;
    private final String date;
    private final String cardVerificationValue;

    public CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 10000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public int getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
