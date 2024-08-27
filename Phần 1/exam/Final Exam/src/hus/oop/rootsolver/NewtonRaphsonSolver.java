package hus.oop.rootsolver;

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
        int count = 0;
        double x0 = lower;

        while (count < maxIterations) {
            if (Math.abs(function.derivative(x0)) < tolerance) {
                break;
            }

            double x1 = x0 - function.evaluate(x0) / function.derivative(x0);

            if (function.evaluate(x1) == 0 || Math.abs(x1 - x0) < tolerance) {
                return x1;
            }

            x0 = x1;
            count++;
        }

        return Double.MIN_VALUE;
    }
}
