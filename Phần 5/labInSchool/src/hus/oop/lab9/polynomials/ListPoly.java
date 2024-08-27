package hus.oop.lab9.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    private List<Double> coefficients;

    public ListPoly(double[] coeff) {
        this.coefficients = new ArrayList<>();
        for (int i = 0; i < coeff.length; i++) {
            coefficients.add(coeff[i]);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        if (coefficients.size() <= 1) {
            return new ListPoly(new double[] {0});
        }
        double[] newCoefficient = new double[coefficients.size() - 1];
        for (int i = 0; i < newCoefficient.length; i++) {
            newCoefficient[i] = coefficients.get(i + 1) * (i + 1);
        }
        return new ListPoly(newCoefficient);
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] result = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }
}
