package hus.oop.design_patterns.lab10.strategy.sort;

public class SelectionSort implements Algorithm {
    @Override
    public void sort(int[] array) {
        System.out.println("Selection Sort");
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
