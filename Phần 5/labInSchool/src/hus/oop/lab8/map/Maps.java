package hus.oop.lab8.map;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        int count = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count++;
        }
        return count;
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map,
                                           int key, int value) {
        return map.containsKey(key) && map.containsValue(value);
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        Set<Integer> setKeys = new LinkedHashSet<>();

        for (Map.Entry<Integer, Integer> listElementOfMap : map.entrySet()) {
            setKeys.add(listElementOfMap.getKey());
        }

        return setKeys;
    }

    public static Collection<Integer> keyValue(Map<Integer, Integer> map) {
        Set<Integer> setKeys = new LinkedHashSet<>();

        for (Map.Entry<Integer, Integer> listElementOfMap : map.entrySet()) {
            setKeys.add(listElementOfMap.getValue());
        }

        return setKeys;
    }

    public static String getColor(int value) {
        Map<Integer, String> mapColor = new HashMap<>();

        mapColor.put(0, "black");
        mapColor.put(1, "white");
        mapColor.put(2, "red");

        return mapColor.get(value);
    }
}
