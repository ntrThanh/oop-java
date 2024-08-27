package hus.oop.lab10.poly;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        return coefficients();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // change poly to string
        for (int i = 0; i < coefficients().length; i++) {
            if (coefficient(i) != 0) {
                sb.append(coefficient(i)).append((i != 0) ? ("x^" + i) : "")
                        .append((i != degree()) ? " + " : "");
            } else {
                continue;
            }
        }
        return sb.toString();
    }
}
