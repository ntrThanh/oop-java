package hus.oop.design_patterns.lab10.strategy.example;

public class TransportItems {
    private ShippingMethod shippingMethod;

    public TransportItems(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void transportItems() {
        shippingMethod.transportItems();
    }

    public void changeShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}

