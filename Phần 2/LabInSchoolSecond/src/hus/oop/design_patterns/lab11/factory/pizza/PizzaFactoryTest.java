package hus.oop.design_patterns.lab11.factory.pizza;

public class PizzaFactoryTest {
    public static void main(String[] args) throws Exception {
        testMakePizza();
    }

    public static void testMakePizza() throws Exception {
        BasePizzaFactory basePizzaFactory = new PizzaFactory();
        Pizza cheesePizza = basePizzaFactory.createPizza("cheese");
        Pizza veggie = basePizzaFactory.createPizza("veggie");
    }
}
