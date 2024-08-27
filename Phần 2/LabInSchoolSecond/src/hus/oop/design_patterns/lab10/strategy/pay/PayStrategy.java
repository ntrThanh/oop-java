package hus.oop.design_patterns.lab10.strategy.pay;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetail();
}
