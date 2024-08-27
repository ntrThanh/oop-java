package hus.oop.review.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        /* TODO */
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
        int n0 = 10;
        double h;
        double currentSum = 0;

        while (true) {
            h = (upper - lower) / n0;
            double newSum = 0;

            for (int i = 1; i < n0; i++) {
                newSum += poly.evaluate(lower + i * h);
            }
            newSum = (poly.evaluate(lower) + poly.evaluate(upper) + 2 * newSum) * h / 2;

            if (Math.abs(newSum - currentSum) / 3 < precision) {
                return newSum;
            } else {
                currentSum = newSum;
                n0 *= 2;
            }
        }
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
        int n0 = numOfSubIntervals;
        double h;
        double currentSum = 0;

        while (true) {
            h = (upper - lower) / n0;
            double newSum = 0;

            for (int i = 1; i < n0; i++) {
                newSum += poly.evaluate(lower + i * h);
            }
            newSum = (poly.evaluate(lower) + poly.evaluate(upper) + 2 * newSum) * h / 2;

            if (Math.abs(newSum - currentSum) / 3 < precision) {
                return newSum;
            } else {
                currentSum = newSum;
                n0 *= 2;
            }
        }
    }
}
