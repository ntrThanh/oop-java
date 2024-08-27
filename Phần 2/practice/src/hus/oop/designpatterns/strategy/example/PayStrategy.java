package hus.oop.designpatterns.strategy.example;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
