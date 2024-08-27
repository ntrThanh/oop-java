package hus.oop.lab4.polynomial;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial myPolynomial1 = new MyPolynomial(1.1, 1.2, 2.2, 3.3);
        MyPolynomial myPolynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        MyPolynomial myPolynomial3 = new MyPolynomial(new double[] {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8});

        System.out.println(myPolynomial1.toString());
        System.out.println(myPolynomial2.toString());
        System.out.println(myPolynomial3.toString());

        System.out.println(myPolynomial1.add(myPolynomial2));
        System.out.println(myPolynomial1.evaluate(1.5));
        System.out.println(myPolynomial3.evaluate(1.3));
        System.out.println(myPolynomial2.evaluate(1.7));
    }
}
