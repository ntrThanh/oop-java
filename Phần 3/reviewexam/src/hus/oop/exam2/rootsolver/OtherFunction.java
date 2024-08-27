package hus.oop.exam2.rootsolver;

public class OtherFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        return x * x - 169;
    }

    @Override
    public double derivativeAt(double x) {
        return 2 * x;
    }
}
