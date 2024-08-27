package hus.oop.design_patterns.lab10.strategy.example;

public class Car implements ShippingMethod {
    @Override
    public void transportItems() {
        System.out.println("The Items were being shipped by car.");
    }
}
