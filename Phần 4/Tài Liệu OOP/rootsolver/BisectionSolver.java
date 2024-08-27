package hus.oop.rootsolver;

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
        int count = 1;

        while (count < maxIterations) {
            double term = (lower + upper) / 2;
            if (function.evaluate(term) == 0 || Math.abs(upper - lower) < tolerance) {
                return term;
            }
            count++;

            if (function.evaluate(lower) * function.evaluate(term) > 0) {
                lower = term;
            } else {
                upper = term;
            }
        }

        return Double.MIN_VALUE;
    }
}
