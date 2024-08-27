package hus.oop.rootsolver;

public class MyMath {
    public static double sin(double x) {
        /* TODO */
        double sum = 0;
        double temp = x;

        for (int i = 0; i < 20; i++) {
            sum += temp;
            temp *= (-1) * x * x
                    / (2 * i + 2) / (2 * i + 3);
        }

        return sum;
    }

    public static double cos(double x) {
        /* TODO */
        double sum = 0;
        double temp = 1;

        for (int i = 0; i < 20; i++) {
            sum += temp;
            temp *= (-1) * x * x
                    / (2 * i + 1) / (2 * i + 2);
        }

        return sum;
    }

    public double exp(double x) {
        /* TODO */
        double sum = 0;
        double temp = 1;

        for (int i = 0; i < 30; i++) {
            sum += temp;
            temp *= x / (i + 1);
        }
        return sum;
    }

    public double ln(double x) {
        /* TODO */
        return Math.log(x);
    }
}
