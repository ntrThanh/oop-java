public class CheckOddEven {
    public static void main(String[] args) {
        int number = 12;
        checkNumber(number);
        System.out.println("Bye!");
    }

    public static void checkNumber(int number) {
        if (number%2 != 0) {
            System.out.println("Old Number");
        } else {
            System.out.println("Even Number");
        }
    }
}
