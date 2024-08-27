package hus.oop.designpatterns.strategy.example2;

public class AdditionOperator implements Operator {
    @Override
    public double doOperation(Evaluable left, Evaluable right) {
        return left.evaluate() + right.evaluate();
    }
}
