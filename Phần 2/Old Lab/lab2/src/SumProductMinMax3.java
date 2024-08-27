import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int number2 = sc.nextInt();
        System.out.println("Enter 3rd integer: ");
        int number3 = sc.nextInt();

        System.out.println("The sum is " + number1 + number2 + number3);
        System.out.println("The product is " + number1 * number2 * number3);
        findMaxMin(number1, number2, number3);
    }

    public static void findMaxMin(int number1, int number2, int number3) {
        int array[] = {number1, number2, number3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
    }
}

