import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = sc.nextDouble();
        System.out.println("Enter height ");
        double height = sc.nextDouble();
        printInformationOfCylinder(radius, height);
    }

    public static void printInformationOfCylinder(double radius, double height) {
        double baseArea = Math.PI * radius * radius;
        System.out.printf("Base Area of Cylinder is %.2f", baseArea);
        System.out.println();
        double surfaceArea = Math.PI * radius * 2 + 2 * baseArea;
        System.out.printf("Surface Area of Cylinder is %.2f", surfaceArea);
        System.out.println();
        double volume = baseArea * height;
        System.out.printf("Volume of Cylinder is %.2f", volume);
        System.out.println();
    }
}
