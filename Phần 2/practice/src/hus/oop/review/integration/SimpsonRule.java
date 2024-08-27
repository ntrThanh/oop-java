package hus.oop.review.integration;

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
        int n0 = 10;
        double h;
        double sum = 0;

        while (true) {
            h = (upper - lower) / n0 / 2;
            double tempSum = 0;
            double temp1 = 0;
            double temp2 = 0;
            for(int i = 0; i < n0; i++) {
                temp1 += poly.evaluate(lower + (2 * i + 1) * h);
                temp2 += poly.evaluate(lower + 2 * i * h);
            }
            tempSum = (poly.evaluate(upper) +
                    poly.evaluate(lower) + 4 * temp1 + 2 * temp2) * h / 3;

            if (Math.abs(tempSum - sum) / 3 < precision) {
                break;
            } else {
                sum = tempSum;
                n0 *= 2;
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
        int n0 = numOfSubIntervals;
        double h;
        double sum = 0;

        while (true) {
            h = (upper - lower) / n0 / 2;
            double tempSum = 0;
            double temp1 = 0;
            double temp2 = 0;
            for(int i = 0; i < n0; i++) {
                temp1 += poly.evaluate(lower + (2 * i + 1) * h);
                temp2 += poly.evaluate(lower + 2 * i * h);
            }
            tempSum = (poly.evaluate(upper) +
                    poly.evaluate(lower) + 4 * temp1 + 2 * temp2) * h / 3;

            if (Math.abs(tempSum - sum) / 3 < precision) {
                break;
            } else {
                sum = tempSum;
                n0 *= 2;
            }
        }
        return sum;
    }
}
