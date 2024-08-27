package hus.oop.exam1.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        coefficents = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public ArrayPolynomial(double[] coefficents) {
        this.coefficents = coefficents;
        this.size = coefficents.length;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        checkBoundaries(size, index);
        return coefficents[index];
    }

    public double[] getCoefficents() {
        return coefficents;
    }

    public void setCoefficents(double[] coefficents) {
        this.coefficents = coefficents;
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     *
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] tempCoefficients = new double[size];
        System.arraycopy(coefficents, 0, tempCoefficients, 0, size);
        return tempCoefficients;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (size >= coefficents.length) {
            enlarge();
        }

        coefficents[size++] = coefficient;
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
        if (size >= coefficents.length) {
            enlarge();
        }
        for(int i = size; i > index; i--) {
            coefficents[i] = coefficents[i - 1];
        }

        coefficents[index] = coefficient;
        size++;
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
        checkBoundaries(size, index);
        coefficents[index] = coefficient;
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
        double sum = 0;
        for(int i = 0; i < size; i++) {
            sum += coefficents[i] * Math.pow(x, i);
        }
        return sum;
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
        if (another.degree() > degree()) {
            for(int i = 0; i < another.getCoefficents().length; i++) {
                another.getCoefficents()[i] += (i < coefficients().length) ? coefficients()[i] : 0;
            }
            this.size = another.degree() + 1;
            setCoefficents(another.getCoefficents());
            return this;
        } else {
            for(int i = 0; i < coefficients().length; i++) {
                coefficents[i] += (i < another.coefficients().length) ?
                        another.coefficients()[i] : 0;
            }
            return this;
        }
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        if (another.degree() > degree()) {
            for(int i = 0; i < another.getCoefficents().length; i++) {
                another.getCoefficents()[i] -= (i < coefficients().length) ? getCoefficents()[i] : 0;
            }
            this.size = another.degree() + 1;
            coefficents = another.getCoefficents();
            return this;
        } else {
            for(int i = 0; i < coefficients().length; i++) {
                coefficents[i] -= (i < another.coefficients().length) ?
                        another.coefficients()[i] : 0;
            }
            return this;
        }
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int newDegree = this.degree() + another.degree();
        double[] currentPolynomial = new double[newDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= another.degree(); j++) {
                currentPolynomial[i + j] += this.coefficents[i] * another.getCoefficents()[j];
            }
        }

        return new ArrayPolynomial(currentPolynomial);
    }

    public static void main(String[] args) {
        System.out.println(new ArrayPolynomial(new double[] {1, 2, 3, 4, 2}).multiply(new ArrayPolynomial(new double[] {7, 4, 1, 3, 1, 8, 9, 3})));
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] tempCoefficient = new double[coefficents.length * 2];
        System.arraycopy(coefficents, 0, tempCoefficient, 0, size);
        coefficents = tempCoefficient;
    }
}
