package hus.oop.designpatterns.decorator.example;

public class VanillaIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "ice cream with vanilla, ";
    }
}
