package hus.oop.exam3.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        coefficients = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public ArrayPolynomial(double[] coefficients) {
        this.coefficients = coefficients;
        size = coefficients.length;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return coefficients;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (size >= coefficients.length) {
            enlarge();
        }

        coefficients[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        for (int i = size; i > index; i--) {
            coefficients[i] = coefficients[i - 1];
        }

        size++;
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double resultSum = 0;

        for (int i = 0; i < size; i++) {
            resultSum += coefficients[i] * Math.pow(x, i);
        }

        return resultSum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        return new ArrayPolynomial(differentiate());
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial plus(Polynomial another) {
        /* TODO */
        double[] resultPoly = new double[Integer.max(degree(), another.degree()) + 1];

        for (int i = 0; i < resultPoly.length; i++) {
            resultPoly[i] = ((i <= degree()) ? coefficient(i) : 0)
                    + ((i <= another.degree()) ? another.coefficient(i) : 0);
        }

        coefficients = resultPoly;
        size = resultPoly.length;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial minus(Polynomial another) {
        /* TODO */
        double[] resultPoly = new double[Integer.max(degree(), another.degree()) + 1];

        for (int i = 0; i < resultPoly.length; i++) {
            resultPoly[i] = ((i <= degree()) ? coefficient(i) : 0)
                    - ((i <= another.degree()) ? another.coefficient(i) : 0);
        }

        coefficients = resultPoly;
        size = coefficients.length;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public Polynomial multiply(Polynomial another) {
        int newDegree = this.degree() + another.degree();
        double[] resultCoefficients = new double[newDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                resultCoefficients[i + j] += this.coefficient(i) * another.coefficient(j);
            }
        }

        coefficients = resultCoefficients;
        size = coefficients.length;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] currentArray = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, currentArray, 0, coefficients.length);
        coefficients = currentArray;
    }
}
