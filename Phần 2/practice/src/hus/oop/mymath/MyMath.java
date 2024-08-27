package hus.oop.mymath;

public class MyMath {
    public static double cos(double x) {
        double sum = 0;
        double temp = 1;

        for (int i = 0; i < 20; i++) {
            sum += temp;
            temp *= (-1) * x * x
                    / (2 * i + 1) / (2 * i + 2);
        }

        return sum;
    }

    public static double sin(double x) {
        double sum = 0;
        double temp = x;

        for (int i = 0; i < 20; i++) {
            sum += temp;
            temp *= (-1) * x * x
                    / (2 * i + 2) / (2 * i + 3);
        }

        return sum;
    }

    public static double expr(double x) {
        double sum = 0;
        double temp = 1;

        for (int i = 0; i < 30; i++) {
            sum += temp;
            temp *= x / (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("cos x using class MyMath: " + cos(12));
        System.out.println("cos x using class lib Math " + Math.cos(12));
        System.out.println("sin x using class MyMath: " + sin(12));
        System.out.println("sin x using class lib Math " + Math.sin(12));
        System.out.println("e^x using class MyMath: " + expr(12));
        System.out.println("e^ x using class lib Math " + Math.exp(12));
    }
}
