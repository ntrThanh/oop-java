package hus.oop.integration;

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
        int count = 0;
        int no = 10;
        double sum = 0;

        while (count < maxIterations) {
            double h = (upper - lower) / no / 2;
            double tempSum = 0;
            double tempSum1 = 0;
            double tempSum2 = 0;

            for (int i = 0; i < no; i++) {
                tempSum1 += poly.evaluate(lower + (2 * i + 1) * h);
                tempSum2 += poly.evaluate(lower + (2 * i) * h);
            }

            tempSum = (poly.evaluate(lower) + poly.evaluate(upper)
                    + 4 * tempSum1 + tempSum2 * 2) * h / 3;

            if (Math.abs(tempSum - sum) / 3 < precision) {
                break;
            } else {
                sum = tempSum;
                no *= 2;
                count++;
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
        int count = 0;
        int no = numOfSubIntervals;
        double sum = 0;
        double h = (upper - lower) / no / 2;

        while (count < maxIterations) {
            double tempSum = 0;
            double tempSum1 = 0;
            double tempSum2 = 0;

            for (int i = 0; i < no; i++) {
                tempSum1 += poly.evaluate(lower + (2 * i + 1) * h);
                tempSum2 += poly.evaluate(lower + (2 * i) * h);
            }

            tempSum = (poly.evaluate(lower) + poly.evaluate(upper)
                    + 4 * tempSum1 + 2 * tempSum2) * h / 3;

            if (Math.abs(tempSum - sum) / 3 < precision) {
                break;
            } else {
                sum = tempSum;
                count++;
            }
        }

        return sum;
    }
}
