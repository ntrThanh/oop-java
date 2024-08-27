import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer ");
        int number = sc.nextInt();

        printReverseNumber(number);
    }

    public static void printReverseNumber(int number) {
        int sum = 0;
        while (number > 0) {
            int remainder = number%10;
            sum = sum * 10 + remainder;
            number /= 10;
        }
        System.out.println("The reverse is " + sum);
    }
}
