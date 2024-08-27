package hus.oop.lab8.collections;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        for (Iterator<Integer> list = first.iterator(); list.hasNext(); ) {
            int result = list.next();
            if (!(first.contains(result) && second.contains(result))) {
                first.remove(result);
            }
        }
        return first;
    }

    public static Set<Integer> unionManual(Set<Integer> first,
                                           Set<Integer> second) {
        for (Iterator<Integer> list = second.iterator(); list.hasNext(); ) {
            int result = list.next();
            first.add(result);
        }
        return first;
    }

    public static Set<Integer> intersection(Set<Integer> first,
                                            Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first,
                                     Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> listInteger = new LinkedHashSet<>(source);
        source = new ArrayList<>(listInteger);
        return source;
    }

    public static Set<Integer> removeDuplicatesManual(List<Integer> source) {

        return null;
    }

    public static String firstRecurringCharacter(String s) {
        StringBuilder result = new StringBuilder("");
        String[] elements = s.trim().split("");
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    return result.append(elements[i]).toString();
                }
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> listChars = new LinkedHashSet<>();
        String[] elements = s.trim().split("");
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    listChars.add(elements[i].charAt(0));
                }
            }
        }
        return listChars;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] arrInteger = new Integer[source.size()];
        int count = 0;
        for (Iterator<Integer> list = source.iterator(); list.hasNext(); ) {
            arrInteger[count] = list.next();
            count++;
        }
        return arrInteger;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.getFirst();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.getLast();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
