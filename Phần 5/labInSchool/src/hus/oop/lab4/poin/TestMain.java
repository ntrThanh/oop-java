package hus.oop.lab4.poin;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPoint myPoint1 = new MyPoint(3, 4);
        System.out.println(myPoint1);
        MyPoint myPoint2 = new MyPoint(5, 6);
        System.out.println(myPoint2);

        myPoint1.setXY(4, 9);
        System.out.println(myPoint1);

        System.out.println(myPoint1.getXY()[0]);
        System.out.println(myPoint1.getXY()[1]);

        System.out.println("Distance point1 to point2 is: " + myPoint1.distance(myPoint2));
        System.out.println(myPoint1.distance());
        System.out.println(myPoint1.distance(5, 6));

        MyPoint[] myPoints = new MyPoint[10];
        for (int i = 0; i < myPoints.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            myPoints[i] = new MyPoint(x, y);
        }
        for (MyPoint point : myPoints) {
            System.out.println(point);
        }
    }
}
