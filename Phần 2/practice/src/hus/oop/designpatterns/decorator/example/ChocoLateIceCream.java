package hus.oop.designpatterns.decorator.example;

public class ChocoLateIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "ice cream with chocolate, ";
    }
}
