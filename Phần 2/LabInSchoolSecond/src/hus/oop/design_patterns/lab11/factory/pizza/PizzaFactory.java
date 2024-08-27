package hus.oop.design_patterns.lab11.factory.pizza;

public class PizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) throws Exception {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new Exception("No such Pizza");

        }
        pizza.bakePizza();
        pizza.addIngredients();

        return pizza;
    }
}

