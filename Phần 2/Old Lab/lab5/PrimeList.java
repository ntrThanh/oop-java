package lab5;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testIsPrime(sc);
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

    public static void testIsPrime(Scanner sc) {
        System.out.println("Please enter the upper bound: ");
        int upperBound = sc.nextInt();
        int countPrimeNum = 0;
        for (int i = 0; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                countPrimeNum++;
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]", countPrimeNum, ((double) countPrimeNum * 100 / upperBound));
    }
}
