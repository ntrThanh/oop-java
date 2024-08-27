package hus.oop.design_patterns.lab10.decorator.icecream;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public abstract String addTopping();
}
