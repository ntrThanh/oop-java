package hus.oop.design_patterns.lab11.abstractfactory.example;

public class PizzaInVietNam implements Pizza {
    private int cost;

    public PizzaInVietNam() {
        this.cost = 12;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void getBill() {
        System.out.println("the bill for pizza in VietNam is: " + cost);
    }
}
