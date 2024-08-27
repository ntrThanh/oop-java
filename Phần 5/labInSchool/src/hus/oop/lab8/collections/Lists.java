package hus.oop.lab8.collections;

import java.util.*;

public class Lists {

    public static void insertFirst(List<Integer> list, int value) {
        list.addFirst(value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list, int value) {
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list, int value) {
        list.remove(Integer.valueOf(666));
    }

    public static boolean isSquareNumber(int number) {
        if (number == 1) {
            return true;
        }
        for (int i = 0; i <= number / 2; i++) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> generateSquare() {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int numberToTry = 1;
        while (count < 10) {
            if (isSquareNumber(numberToTry)) {
                list.add(numberToTry);
                count++;
            }
            numberToTry++;
        }
        return list;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        target = new ArrayList<>();
        target.addAll(source);
    }

    public static void reverse(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
