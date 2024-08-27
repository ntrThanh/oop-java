package lab3;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testExponentArray(sc);
        // testMagicSum(sc);
        // testPrintArray(sc);
        // testArrayToString(sc);
        // testContain(sc);
        // testSearchKeyInArray(sc);
        // testEqualsArray(sc);
        // testSwapArray(sc);
        // testReverseArray(sc);
    }

    public static int exponentArray(int base, int exp) {
        int value = 1;
        for (int i = 1; i <= exp; i++) {
            value = value * base;
        }
        return value;
    }

    public static void testExponentArray(Scanner sc) {
        System.out.println("Enter base :");
        int base = sc.nextInt();
        System.out.println("Enter exponent: ");
        int exp = sc.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is " + exponentArray(base, exp));
    }

    public static boolean hasEightInNumber(int number) {
        while (number > 0) {
            int surplus = number % 10;
            if (surplus == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void testMagicSum(Scanner sc) {
        int number;
        int magicSum = 0;
        System.out.println("Enter apositive integer (or -1 to end) :");
        number = sc.nextInt();
        while (number != -1) {
            if (hasEightInNumber(number)) {
                magicSum += number;
            }
            System.out.println("Enter apositive integer (or -1 to end) :");
            number = sc.nextInt();
        }
        System.out.println("The magic sum is " + magicSum);
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

    public static void printArray(double[] array) {
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

    public static void printArray(float[] array) {
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

    public static void testPrintArray(Scanner sc) {
        System.out.println("1.Integer \n2.Double \n3.Float");
        int number = sc.nextInt();
        if (number == 1) {
            System.out.println("Enter integer Array\nEnter length of array:");
            int lengthOfArray = sc.nextInt();
            int[] array = new int[lengthOfArray];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            printArray(array);
        } else if (number == 2) {
            System.out.println("Enter real number (double) Array\nEnter length of array:");
            int lengthOfArray = sc.nextInt();
            double[] array = new double[lengthOfArray];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextDouble();
            }
            printArray(array);
        } else {
            System.out.println("Enter real number (float) Array\nEnter length of array:");
            int lengthOfArray = sc.nextInt();
            float[] array = new float[lengthOfArray];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextFloat();
            }
            printArray(array);
        }
    }

    public static String arrayToString(int[] array) {
        String stringArray = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                stringArray += array[i] + ", ";
            } else {
                stringArray += array[i] + "]";
            }
        }
        return stringArray;
    }

    public static void testArrayToString(Scanner sc) {
        int[] array = inputArray(sc);
        System.out.println(arrayToString(array));
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void testContain(Scanner sc) {
        int[] array = inputArray(sc);
        System.out.println("Enter a key: ");
        int key = sc.nextInt();

        System.out.println(contains(array, key));
    }

    public static int searchKeyInArray(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return key;
            }
        }
        return -1;
    }

    public static void testSearchKeyInArray(Scanner sc) {
        System.out.println("Enter array: ");
        int[] array1 = inputArray(sc);
        System.out.println("Enter a key: ");
        int key = sc.nextInt();

        System.out.println(searchKeyInArray(array1, key));
    }

    public static boolean equalsArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void testEqualsArray(Scanner sc) {
        System.out.println("Enter array1: ");
        int[] array1 = inputArray(sc);
        System.out.println("Enter array2: ");
        int[] array2 = inputArray(sc);
        System.out.println(equalsArray(array1, array2));
    }

    public static int[] copyOfArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] copyOfArray(int[] array, int newlength) {
        int[] newArray = new int[newlength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void testCopyOfArray(Scanner sc) {
        int[] array = inputArray(sc);
        System.out.println("Array: ");
        printArray(array);

        int[] arrayCopy = copyOfArray(array);
        System.out.println("Array copy");
        printArray(arrayCopy);
    }

    public static boolean swapArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array2.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
        }
        return true;
    }

    public static void testSwapArray(Scanner sc) {
        System.out.println("Enter array1: ");
        int[] array1 = inputArray(sc);
        System.out.println("Enter array2: ");
        int[] array2 = inputArray(sc);

        printArray(array1);
        System.out.println();
        printArray(array2);
        System.out.println();
        System.out.println(swapArray(array1, array2));
        System.out.println("After Swap");
        System.out.println();
        printArray(array1);
        System.out.println();
        printArray(array2);
    }

    public static void reverseArray(int[] array) {
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        printArray(array);
    }

    public static void testReverseArray(Scanner sc) {
        System.out.println("Enter Array: ");
        int[] array = inputArray(sc);

        System.out.println();
        printArray(array);
        System.out.println();
        System.out.println("After reverse");
        System.out.println();
        reverseArray(array);
    }

    // phương thức nhập vào mảng hai chiều từ bàn phím
    public static int[] inputArray(Scanner sc) {
        System.out.println("Enter length of Array: ");
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
