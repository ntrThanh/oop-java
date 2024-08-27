package lab4;

import java.util.Scanner;

public class MathLibraryHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testSinXAndCosX(sc);
        // testFactorialInt(sc);
        // testFibonacciInt(sc);
        // testToRadix(sc);
        // testSpecialSeries(sc);
    }

    public static double sin(double x, int numTerms) {
        double sumSinX = 0;
        double term = x;
        for (int i = 1; i <= numTerms; i++) {
            sumSinX += term;
            term *= -1 * x * x / ((2 * i) * (2 * i + 1));
        }
        return sumSinX;
    }

    public static double cos(double x, int numTerms) {
        double sumCosX = 0;
        double term = 1;
        for (int i = 1; i <= numTerms; i++) {
            sumCosX += term;
            term *= -1 * x * x / ((2 * i) * (2 * i - 1));
        }
        return sumCosX;
    }

    public static void testSinXAndCosX(Scanner sc) {
        System.out.println("Enter x: ");
        double x = Double.parseDouble(sc.nextLine());
        double xToRadian = Math.toRadians(x);
        System.out.println("Enter term: ");
        int term = sc.nextInt();

        System.out.println(sin(xToRadian, term));
        System.out.println(Math.sin(xToRadian));
        System.out.println();
        System.out.println(cos(xToRadian, term));
        System.out.println(Math.cos(xToRadian));
    }

    public static int factorialInt(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorialInt(number - 1);
        }
    }

    public static void testFactorialInt(Scanner sc) {
        System.out.println("Enter number (Integer): ");
        int number = sc.nextInt();

        if (Integer.MAX_VALUE / factorialInt(number - 1) < number + 1) {
            System.out.println("The factoria of " + number + " is out of range");
        } else {
            System.out.println("The factoria of " + number + " is: " + factorialInt(number));
        }
    }

    public static int fibonacciInt(int number) {
        if (number == 0) {
            return 1;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacciInt(number - 1) + fibonacciInt(number - 2);
        }
    }

    public static void testFibonacciInt(Scanner sc) {
        System.out.println("Enter number (Integer): ");
        int number = sc.nextInt();

        int fibResult = fibonacciInt(number);

        if (number > 0 && Integer.MAX_VALUE - fibonacciInt(number - 1) < fibonacciInt(number - 2)) {
            System.out.println("F(" + number + ") is out of range");
        } else {
            System.out.println("F(" + number + ") = " + fibResult);
        }
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (outRadix == 16) {
            return decimalToHexadecimal(radixNToDecimal(in, inRadix));
        } else {
            return decimalToRadix(radixNToDecimal(in, inRadix), outRadix);
        }
    }

    public static void testToRadix(Scanner sc) {
        System.out.println("Enter a number and radix: ");
        String radixSring = sc.nextLine();
        System.out.println("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.println("Enter the output radix: ");
        int outRadix = sc.nextInt();

        System.out.println("\"" + radixSring + "\" in radix " + inRadix + " is " + "\"" +
                toRadix(radixSring, inRadix, outRadix) +
                "\" in radix " + outRadix);

    }

    public static int radixNToDecimal(String radixNStr, int radix) {
        String[] radixNStrArray = radixNStr.trim().toLowerCase().split("");
        for (int i = 0; i < radixNStrArray.length; i++) {
            if (radixNStrArray[i].equals("a")) {
                radixNStrArray[i] = "10";
            } else if (radixNStrArray[i].equals("b")) {
                radixNStrArray[i] = "11";
            } else if (radixNStrArray[i].equals("c")) {
                radixNStrArray[i] = "12";
            } else if (radixNStrArray[i].equals("d")) {
                radixNStrArray[i] = "13";
            } else if (radixNStrArray[i].equals("e")) {
                radixNStrArray[i] = "14";
            } else if (radixNStrArray[i].equals("f")) {
                radixNStrArray[i] = "15";
            }
        }
        int decimalNumber = 0;
        int temp = 1;
        for (int i = radixNStrArray.length - 1; i >= 0; i--) {
            decimalNumber += Integer.parseInt(radixNStrArray[i]) * temp;
            temp *= radix;
        }
        return decimalNumber;
    }

    public static String decimalToHexadecimal(int positiveInteger) {
        String hexaDecimalString = "";
        while (positiveInteger > 0) {
            int surplus = positiveInteger % 16;
            if (surplus == 10) {
                hexaDecimalString = "A" + hexaDecimalString;
            } else if (surplus == 11) {
                hexaDecimalString = "B" + hexaDecimalString;
            } else if (surplus == 12) {
                hexaDecimalString = "C" + hexaDecimalString;
            } else if (surplus == 13) {
                hexaDecimalString = "D" + hexaDecimalString;
            } else if (surplus == 14) {
                hexaDecimalString = "E" + hexaDecimalString;
            } else if (surplus == 15) {
                hexaDecimalString = "F" + hexaDecimalString;
            } else {
                hexaDecimalString = surplus + hexaDecimalString;
            }
            positiveInteger /= 16;
        }
        return hexaDecimalString;
    }

    public static String decimalToRadix(int decimalNumber, int radix) {
        String radixStr = "";
        while (decimalNumber > 0) {
            int surplus = decimalNumber % radix;
            radixStr = Integer.toString(surplus) + radixStr;
            decimalNumber /= radix;
        }
        return radixStr;
    }

    public static double specialSeries(double x, int numberTerms) {
        double sumExponentialSeries = 0;
        double term = x;
        for (int i = 1; i <= numberTerms; i++) {
            sumExponentialSeries += term;
            term *= x * x * (2 * i - 1) / (2 * i) / (2 * i + 1);
        }
        return sumExponentialSeries;
    }

    public static void testSpecialSeries(Scanner sc) {
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter number terms: ");
        int terms = sc.nextInt();
        System.out.println("The sum of exponential series is: " + specialSeries(x, terms));
    }
}