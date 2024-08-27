package hus.oop.design_patterns.lab11.abstractfactory.example;

public class PizzaFactoryInVietNam implements PizzaAbstractFactory {
    @Override
    public Pizza makePizza() {
        return new PizzaInVietNam();
    }
}
