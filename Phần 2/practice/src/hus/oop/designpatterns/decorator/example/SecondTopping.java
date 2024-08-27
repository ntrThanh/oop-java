package hus.oop.designpatterns.decorator.example;

public class SecondTopping extends ToppingDecorator {
    public SecondTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "with second topping, ";
    }

    @Override
    public void addTopping() {
        System.out.println("Add second topping");
    }
}
