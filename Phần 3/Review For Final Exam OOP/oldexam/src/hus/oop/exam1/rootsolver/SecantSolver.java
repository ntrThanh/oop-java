package hus.oop.exam1.rootsolver;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        int count = 0;
        double x0 = lower;
        double x1 = upper;

        while (count < maxIterations) {
            double xn = x1 - function.evaluate(x1) * (x1 - x0)
                    / (function.evaluate(x1) - function.evaluate(x0));

            if (function.evaluate(xn) == 0 || Math.abs(xn - x1) < tolerance) {
                return xn;
            }

            x0 = x1;
            x1 = xn;
            count++;
        }

        return Double.MIN_VALUE;
    }
}
