package hus.oop.lab9.mymap;

public class TestMyMap {
    public static void main(String[] args) {
        MyMap map = new MyHashMap();
        map.put(12, "Thanh");
        map.put(13, "Lan");
        map.put(16, "Trung");
        map.remove(16);
        System.out.println(map.size());
        System.out.println(map.contains(13));
        System.out.println();
        System.out.println(map);
    }
}
