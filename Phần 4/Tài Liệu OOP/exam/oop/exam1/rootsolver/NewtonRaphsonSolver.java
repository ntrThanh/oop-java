package hus.oop.exam1.rootsolver;

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
        double temp1 = lower;

        while (count < maxIterations) {
            double tempN = temp1 - function.evaluate(temp1)
                                / function.derivativeAt(temp1);

            if (function.evaluate(tempN) == 0 || tempN - temp1 < tolerance) {
                return tempN;
            }

            temp1 = tempN;
            count++;
        }

        return Double.MIN_VALUE;
    }
}
