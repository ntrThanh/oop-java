package lab5;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testIsProductOfPrimeFactors(sc);
    }

    public static boolean isPrime(int aPosIntn) {
        if (aPosIntn == 0) {
            return false;
        }
        for (int i = 2; i <= aPosIntn / 2; i++) {
            if (aPosIntn % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int number) {
        int productPrime = 1;
        if (number == 1) {
            return false;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (isPrime(i) && number % i == 0) {
                productPrime *= i;
            }
        }
        if (productPrime == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void testIsProductOfPrimeFactors(Scanner sc) {
        System.out.println("Please enter the upper bound: ");
        int upperBound = sc.nextInt();
        int count = 0;
        StringBuilder strIsProductOfPrimeFactors = new StringBuilder("");
        for (int i = 1; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                strIsProductOfPrimeFactors.append(i + " ");
                count++;
            }
        }
        System.out.println("These numbers are equal to the product of prime factor: ");
        System.out.println(strIsProductOfPrimeFactors);
        System.out.printf("[%d numbers found (%.2f%%)]", count, ((double) count * 100 / upperBound));
    }
}
