import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputValue(sc);
    }
    public static void inputValue(Scanner sc) {
        while (true) {
            System.out.println("Enter a number between 0 - 10 or 90 - 100 ");
            int number = sc.nextInt();
            if (number >= 0 && number <= 10 || number >= 90 & number <= 100)  {
                System.out.println("You have entered " + number);
                break;
            }
            System.out.println("Invalid input , try again . . .");
        }
    }
}
