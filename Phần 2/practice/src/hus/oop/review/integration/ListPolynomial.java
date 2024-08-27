package hus.oop.review.integration;

import java.util.LinkedList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new LinkedList<>();
    }

    public List<Double> getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(List<Double> coefficients) {
        this.coefficients = coefficients;
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        checkBoundaries(coefficients.size(), index);
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     *
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] currentPolynomial = new double[coefficients.size()];
        for(int i = 0; i < currentPolynomial.length; i++) {
            currentPolynomial[i] = coefficients.get(i);
        }
        return currentPolynomial;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */
        checkBoundaries(coefficients.size(), index);
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        checkBoundaries(coefficients.size(), index);
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double sum = 0;
        for(int i = 0; i < coefficients.size(); i++) {
            sum += coefficients.get(i) * Math.pow(x, i);
        }
        return sum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        return new ArrayPolynomial(this.differentiate());
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        if (another.degree() > degree()) {
            for(int i = 0; i < degree() + 1; i++) {
                another.getCoefficients()
                        .set(i, coefficients.get(i) + another.getCoefficients().get(i));
            }

            setCoefficients(another.getCoefficients());
            return this;
        } else {
            for(int i = 0; i < another.degree() + 1; i++) {
                coefficients.set(i, coefficients.get(i) + another.getCoefficients().get(i));
            }
            return this;
        }
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        if (another.degree() > degree()) {
            for(int i = 0; i < degree() + 1; i++) {
                another.getCoefficients()
                        .set(i, coefficients.get(i) - another.getCoefficients().get(i));
            }

            setCoefficients(another.getCoefficients());
            return this;
        } else {
            for(int i = 0; i < another.degree() + 1; i++) {
                coefficients.set(i, coefficients.get(i) - another.getCoefficients().get(i));
            }
            return this;
        }
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        List<Double> list = new LinkedList<>();
        int newDegree = this.degree() + another.degree();
        double[] currentPolynomial = new double[newDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                currentPolynomial[i + j] += this.coefficients.get(i) * another.getCoefficients().get(i);
            }
        }

        for(int i = 0; i < currentPolynomial.length; i++) {
            list.add(currentPolynomial[i]);
        }

        setCoefficients(list);
        return this;
    }
}
