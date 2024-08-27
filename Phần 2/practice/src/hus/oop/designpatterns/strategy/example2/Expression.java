package hus.oop.designpatterns.strategy.example2;

public class Expression implements Evaluable {
    private Evaluable left;
    private Evaluable right;
    private Operator operator;

    public Expression(Evaluable left, Evaluable right) {
        this.left = left;
        this.right = right;
    }

    public Expression(Evaluable left, Evaluable right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public double evaluate() {
        return operator.doOperation(left, right);
    }
}
