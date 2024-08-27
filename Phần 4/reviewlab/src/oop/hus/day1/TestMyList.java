package oop.hus.day1;

public class TestMyList {
    public static void main(String[] args) {
        testMyLinkedList();
    }

    public static void testIterator(MyList list) {
        MyIterator iterator = list.iterator();

        System.out.println("test while with iterator");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    public static void testMyArrayList() {
        MyList list = new MyArrayList();

        list.append("a");
        list.append("b");
        list.append("c");
        list.append("d");

        testIterator(list);

        System.out.println("the size is: " + list.size());
        System.out.println();

        System.out.println("remove index 1");
        list.remove(1);
        System.out.println(list);
        System.out.println();
    }

    public static void testMyLinkedList() {
        MyList list = new MyLinkedList();

        list.append("a");
        list.append("b");
        list.append("c");
        list.append("d");

        testIterator(list);

        System.out.println("the size is: " + list.size());
        System.out.println();

        System.out.println("remove index 1");
        list.remove(1);
        System.out.println(list);
        System.out.println();
    }
}
