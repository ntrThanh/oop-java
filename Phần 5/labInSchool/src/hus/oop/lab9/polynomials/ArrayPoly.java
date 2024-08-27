package hus.oop.lab9.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        if (coefficients.length <= 1) {
            return new ArrayPoly(new double[] {0});
        }
        double[] newCoefficient = new double[coefficients.length - 1];
        for (int i = 0; i < newCoefficient.length; i++) {
            newCoefficient[i] = coefficients[i + 1] * (i + 1);
        }
        return new ArrayPoly(newCoefficient);
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }
}
