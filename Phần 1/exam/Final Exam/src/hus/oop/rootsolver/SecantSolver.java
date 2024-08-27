package hus.oop.rootsolver;

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
        double x0 = upper;
        int count = 0;
        double x1 = lower;

        while (count < maxIterations) {
            double xn = x0 - function.evaluate(x0) * (x0 - x1)
                    / (function.evaluate(x0) - function.evaluate(x1));
            if (function.evaluate(xn) == 0 || (Math.abs(x0 - xn)) < tolerance) {
                return xn;
            }

            x0 = xn;
            count++;
        }

        return Double.MIN_VALUE;
    }
}
