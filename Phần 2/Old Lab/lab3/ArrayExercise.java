package lab3;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testCreateAndPrintArray(sc);
        // testSimpleGradesStatistics(sc);
        // testHexadecimalToBinary(sc);
        // testDecimalToHexadecimal(sc);
    }

    public static int[] createArray(Scanner sc) {
        System.out.println("Enter number of items: ");
        int numberOfItems = sc.nextInt();
        int[] newArray = new int[numberOfItems];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        String stringArray = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                stringArray += array[i] + ", ";
            } else {
                stringArray += array[i] + "]";
            }
        }
        System.out.println(stringArray);
    }

    public static void testCreateAndPrintArray(Scanner sc) {
        int[] newArray = createArray(sc);
        printArray(newArray);
    }

    public static int[] generateStudentGrades(Scanner sc) {
        System.out.println("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[] arrayStudents = new int[numStudents];
        for (int i = 0; i < arrayStudents.length; i++) {
            System.out.println("Enter the grade for student: " + (i + 1) + ":");
            arrayStudents[i] = sc.nextInt();
        }
        return arrayStudents;
    }

    public static void simpleGradesStatistics(int[] arrayStudents) {
        double average = 0;
        int maxGrade = Integer.MIN_VALUE;
        int minGrade = Integer.MAX_VALUE;

        for (int i = 0; i < arrayStudents.length; i++) {
            if (maxGrade <= arrayStudents[i]) {
                maxGrade = arrayStudents[i];
            }
            if (minGrade >= arrayStudents[i]) {
                minGrade = arrayStudents[i];
            }
            average += arrayStudents[i];
        }
        System.out.printf("The average is: %.2f\n", average / (arrayStudents.length));
        System.out.println("The min grade is: " + minGrade);
        System.out.println("The max grade is: " + maxGrade);
    }

    public static void testSimpleGradesStatistics(Scanner sc) {
        int[] arrayStudents = generateStudentGrades(sc);
        simpleGradesStatistics(arrayStudents);
    }

    public static String hexadecimalToBinary(String hexString) {
        String stringBinaryOut = "";
        final String[] binaryString = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        String[] hexStringArray = hexString.toLowerCase().split("");

        for (int i = 0; i < hexStringArray.length; i++) {
            if (hexStringArray[i].equals("a")) {
                hexStringArray[i] = "10";
            } else if (hexStringArray[i].equals("b")) {
                hexStringArray[i] = "11";
            } else if (hexStringArray[i].equals("c")) {
                hexStringArray[i] = "12";
            } else if (hexStringArray[i].equals("d")) {
                hexStringArray[i] = "13";
            } else if (hexStringArray[i].equals("e")) {
                hexStringArray[i] = "14";
            } else if (hexStringArray[i].equals("f")) {
                hexStringArray[i] = "15";
            }
        }
        for (int i = 0; i < hexStringArray.length; i++) {
            for (int j = 0; j < binaryString.length; j++) {
                if (Integer.parseInt(hexStringArray[i]) == j) {
                    stringBinaryOut += binaryString[j] + " ";
                }
            }
        }
        return stringBinaryOut;
    }

    public static void testHexadecimalToBinary(Scanner sc) {
        System.out.println("Enter Hexadecimal string: ");
        String decimalString = sc.nextLine();
        System.out.println("The equivalent binary for hexadecimal " + decimalString + " is: "
                + hexadecimalToBinary(decimalString));

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

    public static void testDecimalToHexadecimal(Scanner sc) {
        System.out.println("Enter decimal number: ");
        int decimalNum = sc.nextInt();
        System.out.println("The equivalent hexadecimal number is: " + decimalToHexadecimal(decimalNum));
    }
}
