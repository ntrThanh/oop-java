package hus.oop.design_patterns.lab10.strategy.pay;

public class Order {
    private int totalCost = 0;
    private boolean isCosted = false;
    private PayStrategy payStrategy;

    public Order(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processOder() {
        payStrategy.collectPaymentDetail();
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost += totalCost;
    }

    public boolean isCosted() {
        return isCosted;
    }

    public void setCosted() {
        isCosted = true;
    }
}
