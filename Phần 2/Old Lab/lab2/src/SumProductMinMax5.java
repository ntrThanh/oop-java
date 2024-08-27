import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        System.out.println("Enter 1st integer: ");
        int number1 = sc.nextInt();
        System.out.println("Enter 2nd integer: ");
        int number2 = sc.nextInt();
        System.out.println("Enter 3rd integer: ");
        int number3 = sc.nextInt();
        System.out.println("Enter 4th integer: ");
        int number4 = sc.nextInt();
        System.out.println("Enter 5th integer: ");
        int number5 = sc.nextInt();
        array = new int[] {number1, number2, number3, number4, number5};

        findSumAndProduct(array);
        findMaxMin(array);
    }

    public static void findMaxMin(int array[]) {
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

    public static void findSumAndProduct(int array[]) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
    }
}
