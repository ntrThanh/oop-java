package hus.oop.exam1.rootsolver;

public class NewFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        return x * x - 2;
    }

    @Override
    public double derivativeAt(double x) {
        return 2 * x;
    }
}
