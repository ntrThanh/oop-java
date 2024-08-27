package hus.oop.exam3.integration;

import java.util.ArrayList;
import java.util.List;

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
        this.coefficients = coefficients;
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] resultData = new double[coefficients.size()];

        for (int i = 0; i < resultData.length; i++) {
            resultData[i] = coefficients.get(i);
        }

        return resultData;
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
        double resultSum = 0;

        for (int i = 0; i < coefficients.size(); i++) {
            resultSum += coefficients.get(i) * Math.pow(x, i);
        }

        return resultSum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        List<Double> resultData = new ArrayList<>();

        for (int i = 0; i < differentiate().length; i++) {
            resultData.add(differentiate()[i]);
        }

        return new ListPolynomial(resultData);
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial plus(Polynomial another) {
        /* TODO */
        int resultPoly = Math.max(degree(), another.degree()) + 1;
        List<Double> resultData = new ArrayList<>();

        for (int i = 0; i < resultPoly; i++) {
            resultData.add(i, ((i <= degree() ? coefficient(i) : 0))
                    + ((i <= another.degree()) ? another.coefficient(i) : 0));
        }

        coefficients = resultData;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial minus(Polynomial another) {
        /* TODO */
        int resultPoly = Math.max(degree(), another.degree()) + 1;
        List<Double> resultData = new ArrayList<>();

        for (int i = 0; i < resultPoly; i++) {
            resultData.add(i, ((i <= degree() ? coefficient(i) : 0))
                    - ((i <= another.degree()) ? another.coefficient(i) : 0));
        }

        coefficients = resultData;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial multiply(Polynomial another) {
        /* TODO */
        ArrayList<Double> listElement = new ArrayList<>();
        int newDegree = this.degree() + another.degree();
        double[] resultCoefficients = new double[newDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                resultCoefficients[i + j] += this.coefficient(i) * another.coefficient(j);
            }
        }


        for (int i = 0; i < resultCoefficients.length; i++) {
            listElement.add(resultCoefficients[i]);
        }

        this.coefficients = listElement;
        return this;
    }
}
