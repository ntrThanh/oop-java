package hus.oop.exam1.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        /* TODO */
        return MyMath.sin(x) * x - 3;
    }

    @Override
    public double derivativeAt(double x) {
        return MyMath.sin(x) + MyMath.cos(x) * x;
    }
}
