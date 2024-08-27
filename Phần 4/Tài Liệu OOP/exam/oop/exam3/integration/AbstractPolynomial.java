package hus.oop.exam3.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder resultStringPoly = new StringBuilder();
        resultStringPoly.append("[");

        for (int i = 0; i < degree() + 1; i++) {
            if (i == 0) {
                resultStringPoly.append(coefficient(i));
            } else if (i == 1) {
                resultStringPoly.append(coefficient(i) + "x");
            } else {
                resultStringPoly.append(coefficient(i) + "x^" + i);
            }

            resultStringPoly.append((i == degree()) ? "" : " + ");
        }

        return resultStringPoly.append("]").toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] differentiate = new double[degree()];

        for (int i = 0; i < differentiate.length; i++) {
            differentiate[i] = coefficient(i + 1) * (i + 1);
        }

        return differentiate;
    }
}
