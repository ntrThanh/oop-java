import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        printInformationOfSphere(radius);
    }

    public static void printInformationOfSphere(double radius) {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.printf("Surface Area of Sphere is %.2f", surfaceArea);
        System.out.println();
        double volume = (4/3) * Math.PI * radius * radius;
        System.out.printf("Volume of Sphere is %.2f", volume);
        System.out.println();
    }
}
