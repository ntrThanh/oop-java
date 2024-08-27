package hus.oop.design_patterns.lab11.factory.pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type) throws Exception;
}
