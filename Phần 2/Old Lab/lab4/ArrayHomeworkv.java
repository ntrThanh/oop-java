package lab4;

import java.util.Scanner;

public class ArrayHomeworkv {
    public static void main(String[] args) {
        printArrayInStars();
    }

    public static void printArrayInStars() {
        Scanner sc = new Scanner(System.in);
        printArrayStars(sc);
    }

    public static void printArrayStars(Scanner sc) {
        System.out.println("Enter the number of items: ");
        int number = sc.nextInt();
        sc.nextLine();
        int[] array = new int[number];

        System.out.print("Enter value of all items: ");
        String input = sc.nextLine();
        String[] arrayNumbers = input.trim().split(" ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            array[i] = Integer.parseInt(arrayNumbers[i]);
            System.out.print(i + ": ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("(" + array[i] + ")");
        }
    }
}
