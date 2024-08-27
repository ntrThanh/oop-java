package hus.oop.lab4.customer;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.getCustomer().getId();
    }

    public String getCustomerName() {
        return this.getCustomer().getName();
    }

    public int getCustomerDiscount() {
        return this.getCustomer().getDiscount();
    }

    public double getAmountAfterDisCount() {
        this.amount -= this.amount * this.getCustomerDiscount() / 100;
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", " + customer.toString() +
                ", amount=" + amount +
                ']';
    }
}
