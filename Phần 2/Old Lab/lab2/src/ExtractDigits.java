import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printDigitInverse(number);
    }
    public static void printDigitInverse(int number) {
        while (number > 0) {
            int remainderOfDigits = number%10;
            System.out.print(remainderOfDigits + " ");
            number /= 10;
        }
    }
}
