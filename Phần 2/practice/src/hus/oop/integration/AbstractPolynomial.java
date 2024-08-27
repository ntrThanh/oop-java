package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder result = new StringBuilder();
        result.append("[");

        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) == 0) {
                continue;
            }
            if (i == 0) {
                result.append(coefficient(i));
            } else if (i == 1) {
                result.append(coefficient(i)).append("x");
            } else {
                result.append(coefficient(i)).append("x^" + i);
            }
            result.append((i == degree()) ? "" : " + ");
        }

        return result.append("]").toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] derivativePoly = new double[degree()];

        for(int i = 0; i < derivativePoly.length; i++) {
            derivativePoly[i] = coefficient(i + 1) * (i + 1);
        }

        return derivativePoly;
    }

    public void checkBoundaries(int limit, int index) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
