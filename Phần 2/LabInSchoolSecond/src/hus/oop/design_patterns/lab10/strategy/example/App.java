package hus.oop.design_patterns.lab10.strategy.example;

public class App {
    public static void main(String[] args) {
        TransportItems transportItems = new TransportItems(new Car());
        transportItems.transportItems();

        transportItems.changeShippingMethod(new Ship());
        transportItems.transportItems();
    }
}
