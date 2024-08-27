package lab5;

import java.util.*;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testLinearSearch(sc);
        // testBinarySearch(sc);
        // testBubbleSort(sc);
        // testSelectionSort(sc);
        // testInsertSort(sc);
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return array[i];
            }
        }
        return 0;
    }

    public static int[] inputArray(Scanner sc) {
        System.out.println("Enter numbers of array: ");
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void testLinearSearch(Scanner sc) {
        int[] array = inputArray(sc);
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (array[fromIdx] == key) {
                return true;
            } else if (array[toIdx] == key) {
                return true;
            } else {
                return false;
            }
        } else {
            int midIdx = (fromIdx + toIdx) / 2;
            if (array[midIdx] == key) {
                return true;
            } else if (array[midIdx] > key) {
                toIdx = midIdx;
                return binarySearch(array, key, fromIdx, toIdx);
            } else {
                fromIdx = midIdx + 1;
                return binarySearch(array, key, fromIdx, toIdx);
            }
        }
    }

    public static void testBinarySearch(Scanner sc) {
        int[] array = inputArray(sc);
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        Arrays.sort(array);
        System.out.println(binarySearch(array, key, 0, array.length - 1));
    }

    public static void bubbleSort(int[] array) {
        // for (int i = 0; i < array.length - 1; i++) {
        // for (int j = i + 1; j < array.length; j++) {
        // if (array[i] > array[j]) {
        // int temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;
        // }
        // }
        // }
        int number = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            number -= 1;
        } while (swapped);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void testBubbleSort(Scanner sc) {
        int[] array = inputArray(sc);
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElement]) {
                    minElement = j;
                }
            }
            if (minElement != i) {
                int temp = array[i];
                array[i] = array[minElement];
                array[minElement] = temp;
            }
        }
    }

    public static void testSelectionSort(Scanner sc) {
        int[] array = inputArray(sc);
        printArray(array);
        selectionSort(array);
        printArray(array);
    }

    public static void insertSort(int[] array) {
        int holePosition, valueToInsert;
        for (int i = 0; i < array.length; i++) {
            valueToInsert = array[i];
            holePosition = i;

            while (holePosition > 0 && array[holePosition - 1] > valueToInsert) {
                array[holePosition] = array[holePosition - 1];
                holePosition -= 1;
            }

            array[holePosition] = valueToInsert;
        }
    }

    public static void testInsertSort(Scanner sc) {
        int[] array = inputArray(sc);
        printArray(array);
        insertSort(array);
        printArray(array);
    }
}
