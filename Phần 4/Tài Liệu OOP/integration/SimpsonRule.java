package hus.oop.exam3.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
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
        double sum = 0;
        int n0 = 20;
        int count = 0;

        while (count < maxIterations) {
            double deltaX = (upper - lower) / n0 / 2;
            double sumEven = 0;
            double sumOdd = 0;

            for (int i = 0; i < n0; i++) {
                sumEven += poly.evaluate(lower + (2 * i) * deltaX);
                sumOdd += poly.evaluate(lower + (2 * i + 1) * deltaX);
            }

            double currentSum = (deltaX / 3) *
                    (poly.evaluate(upper)
                            + poly.evaluate(lower)
                            + 4 * sumOdd + 2 * sumEven);

            if (Math.abs(currentSum - sum) / 3 < precision) {
                break;
            } else {
                sum = currentSum;
                count++;
                n0 = n0 * 2;
            }
        }

        return sum;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double sum = 0;
        int n0 = numOfSubIntervals;
        int count = 0;
        double deltaX = (upper - lower) / n0 / 2;

        while (count < maxIterations) {
            double sumEven = 0;
            double sumOdd = 0;

            for (int i = 0; i < n0; i++) {
                sumEven += poly.evaluate(lower + (2 * i) * deltaX);
                sumOdd += poly.evaluate(lower + (2 * i + 1) * deltaX);
            }

            double currentSum = (deltaX / 3) *
                    (poly.evaluate(upper)
                            + poly.evaluate(lower)
                            + 4 * sumOdd + 2 * sumEven);

            if (Math.abs(currentSum - sum) / 3 < precision) {
                break;
            } else {
                sum = currentSum;
                count++;
            }
        }

        return sum;
    }
}
