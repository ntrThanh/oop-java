package hus.oop.design_patterns.lab11.abstractfactory.example;

public class Application {
    public static void main(String[] args) {
        PizzaAbstractFactory pizzaAbstractFactory = new PizzaFactoryInVietNam();
        Pizza pizza = pizzaAbstractFactory.makePizza();
        pizza.getBill();

        PizzaAbstractFactory pizzaAbstractFactory1 = new PizzaFactoryInAmerica();
        Pizza pizza1 = pizzaAbstractFactory1.makePizza();
        pizza1.getBill();
    }
}
