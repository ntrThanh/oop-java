package hus.oop.exam2.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        /* TODO */
        return x * MyMath.sin(x) - 3;
    }

    @Override
    public double derivativeAt(double x) {
        return MyMath.sin(x) + x * MyMath.cos(x);
    }
}
