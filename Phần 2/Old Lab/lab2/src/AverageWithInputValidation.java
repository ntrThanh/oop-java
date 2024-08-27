import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputMark(sc);
    }
    public static void inputMark(Scanner sc) {
        int sum = 0; // biến tổng điểm của các sinh viên
        int[] arrayMark = new int[3]; // mảng có 3 phần tử tương ứng với 3 học sinh
        int count = 0; // biến đếm
        while (count < 3) {
            System.out.println("Enter the mark (0-100) for student " + (count + 1) + " ");
            arrayMark[count] = sc.nextInt();
            if (arrayMark[count] >= 0 && arrayMark[count] <= 100) {
                sum += arrayMark[count];
                count++;
            } else {
                System.out.println("Invalid input , try again . . .");
            }
        }
        double averageMark = (double) sum / 3;
        System.out.printf("The average is %.2f", averageMark);
    }
}
