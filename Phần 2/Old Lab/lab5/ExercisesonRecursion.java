package lab5;

import java.util.Scanner;

public class ExercisesonRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testfindFactorial(sc);
        // testFibonacci(sc);
        // testLen(sc);
        // testGcdNumber(sc);
    }

    public static int findFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * findFactorial(number - 1);
        }
    }

    public static void testfindFactorial(Scanner sc) {
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(findFactorial(number));
    }

    public static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void testFibonacci(Scanner sc) {
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }

    public static String len(int number) {
        if (number == 1) {
            return 1 + "";
        } else {
            return len(number - 1) + number;
        }
    }

    public static void testLen(Scanner sc) {
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(len(number));
    }

    public static int gcdNumber(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcdNumber(num2, num1 % num2);
        }
    }

    public static void testGcdNumber(Scanner sc) {
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();
        if (firstNum > secondNum) {
            System.out.println(gcdNumber(firstNum, secondNum));
        } else {
            System.out.println(gcdNumber(secondNum, firstNum));
        }
    }
}
