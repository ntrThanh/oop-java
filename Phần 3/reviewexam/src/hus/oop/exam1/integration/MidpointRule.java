package hus.oop.exam1.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
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
        int n0 = 100;
        int count = 0;
        double h;
        double sum = 0;
        while (true) {
            h = (upper - lower) / n0;
            double temp = 0;
            for(int i = 0; i < n0; i++) {
                double midX = lower + h * (i + 0.5);
                temp += poly.evaluate(midX);
            }
            temp *= h;

            if (Math.abs(temp - sum) / 3 < precision || count > maxIterations) {
                break;
            } else {
                sum = temp;
                n0 = n0 * 2;
                count++;
            }
        }
        return sum;
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
        int count = 0;
        double h;
        double sum = 0;
        while (true) {
            h = (upper - lower) / n0;
            double temp = 0;
            for(int i = 0; i < n0; i++) {
                double midX = lower + h * (i + 0.5);
                temp += poly.evaluate(midX);
            }
            temp *= h;

            if (Math.abs(temp - sum) / 3 < precision || count > maxIterations) {
                break;
            } else {
                sum = temp;
                n0 = n0 * 2;
                count++;
            }
        }
        return sum;
    }
}
