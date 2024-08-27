package hus.oop.integration;

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
        this.size = 0;
    }

    public ArrayPolynomial(double[] arrayPoly) {
        this.coefficients = arrayPoly;
        this.size = arrayPoly.length;
    }

    public int getSize() {
        return size;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        checkBoundaries(this.size, index);

        return coefficients[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return this.coefficients;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (this.size >= this.coefficients.length) {
            enlarge();
        }

        this.coefficients[size++] = coefficient;
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
        checkBoundaries(this.size, index);

        for (int i = size; i > index; i++) {
            this.coefficients[i] = this.coefficients[i - 1];
        }

        this.size++;
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
        checkBoundaries(this.size, index);
        this.coefficients[index] = coefficient;

        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return this.size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double resultEvaluate = coefficients[0];

        for (int i = 1; i < size; i++) {
            resultEvaluate += coefficients[i] * Math.pow(x, i);
        }

        return resultEvaluate;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        return new ArrayPolynomial(this.differentiate());
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        double[] currentPoly = new double[Math.max(degree(), another.degree()) + 1];

        for (int i = 0; i < currentPoly.length; i++) {
            currentPoly[i] = ((i < this.getSize()) ? this.coefficient(i) : 0)
                    + ((i < another.getSize()) ? another.coefficient(i) : 0);
        }

        this.coefficients = currentPoly;
        this.size = currentPoly.length;

        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        double[] currentPoly = new double[Math.max(degree(), another.degree()) + 1];

        for (int i = 0; i < currentPoly.length; i++) {
            currentPoly[i] = ((i < this.getSize()) ? this.coefficient(i) : 0)
                    - ((i < another.getSize()) ? another.coefficient(i) : 0);
        }

        this.coefficients = currentPoly;
        this.size = currentPoly.length;

        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        int newDegree = this.degree() + another.degree();
        double[] currentPolynomial = new double[newDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                currentPolynomial[i + j] += this.coefficients[i] * another.coefficient(i);
            }
        }

        this.coefficients = currentPolynomial;
        this.size = newDegree + 1;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] currentPoly = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, currentPoly, 0, coefficients.length);
        this.coefficients = currentPoly;
    }
}
