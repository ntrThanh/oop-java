package hus.oop.lab9.polynomials;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        return coefficients();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder stringOfCoefficients = new StringBuilder();
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != 0) {
                stringOfCoefficients.append(coefficient(i)).
                        append((i != 0) ? ("x^" + i) : ("")).append(((i != degree()) ? " + " : ""));
            } else {
                continue;
            }
        }
        return stringOfCoefficients.toString();
    }
}
