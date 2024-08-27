package hus.oop.generic.example;

public class SecondExample {
    // viec khai bao <T> de khai bao rang co dung kieu du lieu T trong phuong thuc
    public <T> void methodGeneric(T[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
