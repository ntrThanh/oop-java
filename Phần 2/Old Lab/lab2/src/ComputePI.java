import java.util.Scanner;

public class ComputePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double piComputed = computedPi(number);
        System.out.println("pi = " + piComputed);
        computedPiMaxTerm();
        double comparePiValue = (piComputed / Math.PI) * 100;
        System.out.println("(piComputed / Math.PI) * 100 = " + comparePiValue);
    }
    public static double computedPi(int number) {
        double maxDenominator = 0.0;
        for (int i = 0; i < number; i++) {
            if (i%4 == 1) {
                maxDenominator += (double) 1 / i;
            } else if (i%4 == 3) {
                maxDenominator -= (double)  1/ i;
            }
        }
        return maxDenominator * 4;
    }
    public static void computedPiMaxTerm() {
        int maxTerm = 1000;
        double sum = 0.0;
        for (int i = 0; i < maxTerm; i++) {
            double term = (i % 2 == 0) ? 1.0 / (2 * i + 1) : -1.0 / (2 * i + 1);
            sum += term;
        }
        double piApproximation = 4 * sum;
        System.out.println("pi = " + piApproximation);
    }
}
