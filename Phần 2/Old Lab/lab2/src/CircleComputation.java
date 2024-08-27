import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        printInformationOfCircle(radius);
    }

    public static void printInformationOfCircle(double radius) {
        System.out.printf("diameter is %.2f", radius * 2);
        System.out.println();
        double area = Math.PI * radius * radius;
        System.out.printf("area is %.2f", area);
        System.out.println();
        double circumference = Math.PI * radius * 2;
        System.out.printf("circumference is %.2f", circumference);

    }
}
