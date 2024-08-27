package hus.oop.exam1.integration;

public class Application {
    public static void main(String[] args) {
        ArrayPolynomial polynomial = new ArrayPolynomial(new double[] {1, 2, 3, 5, -12});
        System.out.println("the poly is: " + polynomial);
        System.out.println("the derivative is " + polynomial.derivative());
        ArrayPolynomial polynomial1 = new ArrayPolynomial(new double[] {3, 5, 4, 6, 8, 2});
        System.out.println("the poly1 + poly2 = " + polynomial.plus(polynomial1));
        System.out.println("the poly1 x poly2 = " + polynomial.multiply(polynomial1));

        IntegrationCalculator integrationCalculator =
                new IntegrationCalculator(new MidpointRule(0.01, 100), polynomial);
        System.out.println(integrationCalculator.integrate(2, 4));
    }
}
