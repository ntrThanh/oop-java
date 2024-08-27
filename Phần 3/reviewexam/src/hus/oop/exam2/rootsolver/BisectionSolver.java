package hus.oop.exam2.rootsolver;

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
        if ((function.evaluate(lower) < 0 && function.evaluate(upper) < 0)
                || function.evaluate(lower) > 0 && function.evaluate(upper) > 0) {
            return Double.MIN_VALUE;
        }
        int count = 1;
        while (count < maxIterations) {
            double c = (lower + upper) / 2;
            if (function.evaluate(c) == 0 || (upper - lower) / 2 < tolerance) {
                return c;
            }
            count += 1;
            if (function.evaluate(c) * function.evaluate(lower) > 0) {
                lower = c;
            } else {
                upper = c;
            }
        }
        return Double.MIN_VALUE;
    }
}
