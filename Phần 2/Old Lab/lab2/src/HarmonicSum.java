import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double sumHarmonicLf = sumHarmonicLeft(number);
        double sumHarmonicR = sumHarmonicRight(number);
        System.out.println("Sum Harmonic left is " + sumHarmonicLf);
        System.out.println("Sum Harmonic right is " + sumHarmonicR);
        absoluteDifference(number);
    }

    public static double sumHarmonicLeft(int number) {
        double sumHarmonicLf = 0.0;
        for (int i = 1; i <= number; i++) {
            sumHarmonicLf += (double) 1 / i;
        }
        return sumHarmonicLf;
    }

    public static double sumHarmonicRight(int number) {
        double sumHarmonicR = 0.0;
        for (int i = number; i >= 1; i--) {
            sumHarmonicR += (double) 1 / i;
        }
        return sumHarmonicR;
    }

    public static void absoluteDifference(int number) {
        double sumHarmonicLf = sumHarmonicLeft(number);
        double sumHarmonicR = sumHarmonicRight(number);
        double absoluteSum = Math.abs(sumHarmonicR - sumHarmonicLf);
        System.out.println("Absolute difference:" + absoluteSum);
    }
}
