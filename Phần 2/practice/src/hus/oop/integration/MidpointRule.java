package hus.oop.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        /* TODO */
        this.maxIterations = maxIterations;
        this.precision = precision;
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
        double n0 = 10;

        while (count < maxIterations) {
            double h = (upper - lower) / n0;
            double term = 0;

            for (int i = 1; i < n0; i++) {
                double mid = lower + h * (i + precision);
                term += poly.evaluate(mid);
            }

            term *= h;

            if (Math.abs(term - sum) / 3 < precision) {
                break;
            } else {
                sum = term;
                count++;
                n0 *= 2;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Polynomial polynomial = new ArrayPolynomial(new double[] {1, 2, 3, 4});
        MidpointRule midpointRule = new MidpointRule(0.001, 1000);

        System.out.println(midpointRule.integrate(polynomial, 0, 5, 10000000));
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
        double n0 = numOfSubIntervals;

        while (count < maxIterations) {
            double h = (upper - lower) / n0;
            double term = 0;

            for (int i = 1; i < n0; i++) {
                double mid = lower + h * i;
                term += poly.evaluate(mid);
            }

            term *= h;

            if (Math.abs(term - sum) / 3 < precision) {
                break;
            } else {
                sum = term;
                count++;
            }
        }

        return sum;
    }
}
