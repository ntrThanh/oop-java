package hus.oop.designpatterns.decorator.example;

public class FirstTopping extends ToppingDecorator {
    public FirstTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "with first topping, ";
    }

    @Override
    public void addTopping() {
        System.out.println("Add first topping");
    }
}
