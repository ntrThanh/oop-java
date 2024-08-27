package hus.oop.designpatterns.strategy.example;

public class Order {
    private int totalCost;
    private boolean isCloset;
    private static Order order;
    private PayStrategy payStrategy;

    public static Order getInstance() {
        if (order == null) {
            order = new Order();
        }

        return order;
    }
    private Order() {
        isCloset = true;
        totalCost = 0;
    }
    public void processOrder() {
        payStrategy.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isCloset() {
        return isCloset;
    }

    public void setCloset(boolean closet) {
        isCloset = closet;
    }

    public static Order getOrder() {
        return order;
    }

    public static void setOrder(Order order) {
        Order.order = order;
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
