package hus.oop.exam2.rootsolver;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        double x0 = lower;
        int count = 0;
        while (count < maxIterations) {
            if (Math.abs(function.derivativeAt(x0)) < tolerance) {
                break;
            }
            double xn = x0 - function.evaluate(x0) / function.derivativeAt(x0);

            if (function.evaluate(xn) == 0 || Math.abs(xn - x0) < tolerance) {
                return xn;
            }

            x0 = xn;
        }
        return Double.MIN_VALUE;
    }
}
