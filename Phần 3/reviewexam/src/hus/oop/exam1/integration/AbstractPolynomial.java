package hus.oop.exam1.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i = 0; i < coefficients().length; i++) {
            stringBuilder.append(coefficients()[i])
                    .append((i == 0) ? "" : ((i == 1) ? "x" : ("x^" + i)))
                    .append((i < coefficients().length - 1) ? " + " : "");
        }
        return stringBuilder.append("]").toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] differentiate = new double[coefficients().length - 1];
        for(int i = 0; i < differentiate.length; i++) {
            differentiate[i] = coefficients()[i + 1] * (i + 1);
        }
        return differentiate;
    }

    public void checkBoundaries(int limit, int index) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
