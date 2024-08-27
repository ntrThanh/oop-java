package hus.oop.exam2.rootsolver;

public class MyMath {
    public static double sin(double x) {
        /* TODO */
        double result = x;
        double temp = x;

        for (int i = 1; i < 20; i++) {
            temp *= (-1) * Math.pow(x, 2)
                    / ((2 * i) * (2 * i + 1));
            result += temp;
        }

        return result;
    }

    public static double cos(double x) {
        /* TODO */
        double result = 1.0;
        double temp = 1.0;

        for(int i = 1; i < 20; i++) {
            temp *= (-1) * x * x / (2 * i - 1) / (2 * i);
            result += temp;
        }

        return result;
    }

    public static double exp(double x) {
        /* TODO */
        double result = 0;
        double temp = 1;
        for (int i = 0; i < 20; i++) {
            result += temp;
            temp *= x / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MyMath.exp(1));
    }

    public static double ln(double x) {
        if (x <= 0) {
            return Double.NaN;
        }

        double result = 0;
        double temp = x - 1;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result -= temp / i;
            } else {
                result += temp / i;
            }
            temp *= (x - 1);
        }

        return result;
    }
}
