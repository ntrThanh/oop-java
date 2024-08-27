package hus.oop.lab10.poly;

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
        if (degree() <= 0) {
            return new ArrayPoly(new double[] {0});
        }

        double[] newPolyArray = new double[coefficients.length - 1];
        for (int i = 0; i < coefficients.length - 1; i++) {
            newPolyArray[i] = coefficients[i + 1] * (i + 1);
        }
        return new ArrayPoly(newPolyArray);
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
