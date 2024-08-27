package lab5;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testPerfectAndDeficientNumbers(sc);
    }

    public static boolean isPerfect(int number) {
        int sumFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumFactors += i;
            }
        }
        if (sumFactors == number) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDeficient(int number) {
        int sumFactors = 0;
        if (number == 0) {
            return false;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumFactors += i;
            }
        }
        if (sumFactors < number) {
            return true;
        } else {
            return false;
        }
    }

    public static void testIsPerfect(Scanner sc) {
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(isPerfect(number));
    }

    public static void testPerfectAndDeficientNumbers(Scanner sc) {
        System.out.println("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        StringBuilder strPerfect = new StringBuilder("");
        StringBuilder strDeficient = new StringBuilder("");
        int countPerfectNum = 0;
        int countNumber = 0;

        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                countPerfectNum++;
                strPerfect.append(i + " ");
            } else {
                if (!isDeficient(i)) {
                    countNumber++;
                    strDeficient.append(i + " ");
                }
            }
        }

        System.out.println("These numbers are perfect: ");
        System.out.println(strPerfect);
        System.out.printf("[%d perfect numbers found (%.2f%%)]\n", countPerfectNum,
                ((double) countPerfectNum * 100 / upperBound));

        System.out.println("These numbers are neither deficient nor perfect: ");
        System.out.println(strDeficient);
        System.out.printf("[%d numbers found (%.2f%%)]", countNumber,
                ((double) countNumber * 100 / upperBound));
    }
}
