package hus.oop.lab5.polynomial;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial myPolynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial myPolynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        double[] coeffs = new double[] {1.2, 3.4, 5.6, 7.8};
        MyPolynomial myPolynomial3 = new MyPolynomial(coeffs);

        System.out.println(myPolynomial1.toString());
        System.out.println(myPolynomial2.toString());
        System.out.println(myPolynomial3.toString());

        System.out.println(myPolynomial1.toString() + " add " +
                            myPolynomial2.toString() + " is " +
                            myPolynomial1.add(myPolynomial2));
    }
}
