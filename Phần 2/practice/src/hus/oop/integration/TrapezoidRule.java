package hus.oop.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int count = 0;
        double sum = 0;
        int n0 = 10;
        double xn, previousX;

        while (count < maxIterations) {
            double h = (upper - lower) / n0;
            double tempSum = 0;
            previousX = lower;  // Reset previousX to the lower bound
            xn = lower + h;

            for (int i = 0; i < n0; i++) {
                tempSum += (poly.evaluate(previousX) + poly.evaluate(xn)) * h / 2;
                previousX = xn;
                xn += h;
            }

            if (Math.abs(tempSum - sum) < precision) {
                break;
            } else {
                sum = tempSum;
                count++;
                n0 *= 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Polynomial polynomial = new ArrayPolynomial(new double[] {1, 2, 3, 4});
        TrapezoidRule trapezoidRule = new TrapezoidRule(0.0001, 1001);
        System.out.println(trapezoidRule.integrate(polynomial, 0, 5));
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        int count = 0;
        double sum = 0;
        int n0 = 10;
        double xn, previousX;

        while (count < maxIterations) {
            double h = (upper - lower) / n0;
            double tempSum = 0;
            previousX = lower;  // Reset previousX to the lower bound
            xn = lower + h;

            for (int i = 0; i < n0; i++) {
                tempSum += (poly.evaluate(previousX) + poly.evaluate(xn)) * h / 2;
                previousX = xn;
                xn += h;
            }

            if (Math.abs(tempSum - sum) < precision) {
                break;
            } else {
                sum = tempSum;
                count++;
                n0 *= 2;
            }
        }

        return sum;
    }
}
