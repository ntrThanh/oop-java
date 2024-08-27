package hus.oop.design_patterns.lab11.abstractfactory.example;

public class PizzaInAmerica implements Pizza {
    private int cost;

    public PizzaInAmerica() {
        this.cost = 20;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void getBill() {
        System.out.println("the bill for pizza in america is: " + cost);
    }
}
