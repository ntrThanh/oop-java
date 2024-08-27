package hus.oop.design_patterns.lab11.factory.pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for pepperoni pizza");
    }
}
