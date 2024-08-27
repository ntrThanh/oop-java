package hus.oop.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        /* TODO */
        return x * MyMath.sin(x) - 3;
    }

    @Override
    public double derivative(double x) {
        /* TODO */
        return MyMath.sin(x) + MyMath.cos(x) * x;
    }
}
