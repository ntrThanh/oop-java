package hus.oop.design_patterns.lab10.strategy.example;

public class Motorbike implements ShippingMethod {
    @Override
    public void transportItems() {
        System.out.println("The Items were shipped by motorbike.");
    }
}
