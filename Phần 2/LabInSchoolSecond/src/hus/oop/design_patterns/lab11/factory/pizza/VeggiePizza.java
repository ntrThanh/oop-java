package hus.oop.design_patterns.lab11.factory.pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("preparing ingredient for veggie pizza");
    }
}
