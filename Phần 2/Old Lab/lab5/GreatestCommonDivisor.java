package lab5;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testGcdNumber(sc);
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
