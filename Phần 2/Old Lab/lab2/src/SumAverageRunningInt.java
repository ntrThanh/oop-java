import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerBound = sc.nextInt();
        int upperBound = sc.nextInt();
        sumNumbers(lowerBound, upperBound);
        sumSquares(lowerBound, upperBound);
    }

    public static void sumNumbers(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is "+ sum);
        double avgnumber = (double) sum / count;
        System.out.println("The average is " + avgnumber);
    }

    public static void sumSquares(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i*i;
        }
        System.out.println("Sum of Squares is " + sum);
    }

    public static void sumOddEvenNumbers(int lowerBound, int upperBound) {
        int sumOddNumbers = 0;
        int sumEvenNumbers = 0;
        int absDiff = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i%2 == 0) {
                sumEvenNumbers += i;
            } else if (i%2 != 0) {
                sumOddNumbers += i;
            }
        }

        absDiff = Math.abs(sumEvenNumbers - sumOddNumbers);
        System.out.println("The sum of even number is " + sumEvenNumbers);
        System.out.println("The sum of odd number is " + sumOddNumbers);
        System.out.println("The sum of diff is " + absDiff);
    }
}
