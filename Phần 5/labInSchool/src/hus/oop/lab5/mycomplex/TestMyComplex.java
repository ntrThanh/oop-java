package hus.oop.lab5.mycomplex;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complex number 1:");
        double realNum1 = sc.nextDouble();
        double imagNum1 = sc.nextDouble();
        System.out.println("Enter complex number 2:");
        double realNum2 = sc.nextDouble();
        double imagNum2 = sc.nextDouble();

        MyComplex myComplex1 = new MyComplex(realNum1, imagNum1);
        MyComplex myComplex2 = new MyComplex(realNum2, imagNum2);

        System.out.println("Number 1 is: " + myComplex1.toString());
        System.out.println(myComplex1.toString() + " is " + (!myComplex1.isReal()? "NOT" : "") + " a pure real number");
        System.out.println(myComplex1.toString() + " is " + (!myComplex1.isImaginary()? "NOT" : "") + " a pure imaginary number");
        System.out.println();

        System.out.println("Number 2 is: " + myComplex2.toString());
        System.out.println(myComplex1.toString() + " is " + (!myComplex1.isReal()? "NOT" : "") + " a pure real number");
        System.out.println(myComplex1.toString() + " is " + (!myComplex1.isImaginary()? "NOT" : "") + " a pure imaginary number");
        System.out.println();

        System.out.println(myComplex1.toString() + " is " + (!myComplex1.equals(myComplex2)? "NOT" : "") + " equal to " + myComplex2.toString());
        System.out.println(myComplex1.toString() + " + " + myComplex2.toString() + " = " + myComplex1.addNew(myComplex2).toString());
    }
}
