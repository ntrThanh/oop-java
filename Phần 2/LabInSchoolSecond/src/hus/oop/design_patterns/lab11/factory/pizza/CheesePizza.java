package hus.oop.design_patterns.lab11.factory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for cheese pizza");
    }
}
