package hus.oop.integration;

import java.util.*;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<>();
    }

    public ListPolynomial(List<Double> coefficients) {
        /* TODO */
        this.coefficients = coefficients;
    }

    public List<Double> getCoefficients() {
        return coefficients;
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        checkBoundaries(coefficients.size(), index);
        return this.coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] currentPoly = new double[coefficients.size()];

        for (int i = 0; i < currentPoly.length; i++) {
            currentPoly[i] = this.coefficients.get(i);
        }

        return currentPoly;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        this.coefficients.add(coefficient);
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
        checkBoundaries(this.coefficients.size(), index);
        this.coefficients.add(index, coefficient);
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
        this.coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        return this.coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double sumEvaluate = this.coefficients.getFirst();

        for (int i = 1; i < coefficients.size(); i++) {
            sumEvaluate += this.coefficients.get(i) * Math.pow(x, i);
        }

        return sumEvaluate;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        ArrayList<Double> listElement = new ArrayList<>();
        for (int i = 0; i < this.differentiate().length; i++) {
            listElement.add(this.differentiate()[i]);
        }
        
        return new ListPolynomial(listElement);
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        int newDegree = Math.max(degree(), another.degree()) + 1;
        ArrayList<Double> listElement = new ArrayList<>();

        for (int i = 0; i < newDegree; i++) {
            listElement.add(((i < this.coefficients.size()) ? this.coefficient(i) : 0)
                    + ((i < another.getCoefficients().size()) ? another.coefficient(i) : 0));
        }

        this.coefficients = listElement;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        int newDegree = Math.max(degree(), another.degree()) + 1;
        ArrayList<Double> listElement = new ArrayList<>();

        for (int i = 0; i < newDegree; i++) {
            listElement.add(((i < this.coefficients.size()) ? this.coefficient(i) : 0)
                    - ((i < another.getCoefficients().size()) ? another.coefficient(i) : 0));
        }

        this.coefficients = listElement;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        int newDegree = this.degree() + another.degree();
        double[] currentPolynomial = new double[newDegree + 1];
        ArrayList<Double> listElement = new ArrayList<>();

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                currentPolynomial[i + j] += this.coefficient(i) * another.coefficient(i);
            }
        }

        for (int i = 0; i < currentPolynomial.length; i++) {
            listElement.add(currentPolynomial[i]);
        }

        this.coefficients = listElement;
        return this;
    }

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(2.0);
        list.add(1.0);
        list.add(42.0);
        list.add(4.0);
        List<Double> list1 = new ArrayList<>();
        list1.add(2.1);
        list1.add(2.2);
        list1.add(1.6);
        list1.add(4.0);
        list1.add(10.0);
        list1.add(101.0);

        ListPolynomial listPolynomial = new ListPolynomial(list);
        System.out.println(listPolynomial.multiply(new ListPolynomial(list1)));
    }
}
