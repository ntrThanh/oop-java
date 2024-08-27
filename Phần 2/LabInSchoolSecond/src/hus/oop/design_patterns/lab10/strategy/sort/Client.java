package hus.oop.design_patterns.lab10.strategy.sort;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int[] array = new int[]{6, 3, 7, 2, 6, 88, 9, 23, 45, 21, 22, 12, 15};

        Sort sort = new Sort(new BubbleSort(), array);

        sort.sortData();
        sort.printData();

        sort.setAlgorithm(new InsertSort());
        sort.sortData();
        sort.printData();
    }
}
