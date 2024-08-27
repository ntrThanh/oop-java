package hus.oop.designpatterns.strategy.example2;

public class Operand implements Evaluable {
    private double data;

    public Operand(double data) {
        this.data = data;
    }

    @Override
    public double evaluate() {
        return data;
    }
}
