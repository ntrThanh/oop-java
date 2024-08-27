package hus.oop.lab4.polynomial;

public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double sumPoly  = 0;
        double term = 1;
        for (int i = 0; i < coeffs.length; i++) {
            sumPoly += coeffs[i] * term;
            term *= x;
        }
        return sumPoly;
    }

    public String toString() {
        String polyString = "";
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i != 0) {
                polyString += coeffs[i] + "x^" + i + " + ";
            } else {
                polyString += coeffs[i];
            }
        }
        return polyString;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxLength = Math.max(right.getCoeffs().length, coeffs.length);
        double[] result = new double[maxLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i < coeffs.length ? coeffs[i] : 0) +
                    (i < right.getCoeffs().length ? right.getCoeffs()[i] : 0);
        }
        return new MyPolynomial(result);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newLength = this.coeffs.length + right.coeffs.length - 1;
        double[] result = new double[newLength];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                result[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(result);
    }
}
