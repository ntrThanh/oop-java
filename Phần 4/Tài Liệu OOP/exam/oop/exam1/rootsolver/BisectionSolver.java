package hus.oop.exam1.rootsolver;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        int count = 0;

        while (count < maxIterations) {
            double xn = (lower + upper) / 2;

            if (function.evaluate(xn) == 0 || Math.abs(lower - upper) < tolerance) {
                return xn;
            }

            if (function.evaluate(xn) * function.evaluate(lower) > 0) {
                lower = xn;
            } else {
                upper = xn;
            }

            count++;
        }

        return Double.MIN_VALUE;
    }
}
