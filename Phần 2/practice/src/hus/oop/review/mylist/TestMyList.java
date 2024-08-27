package hus.oop.review.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList arrayList = new MyArrayList();
        arrayList.append(3.0);
        arrayList.append(6.0);
        arrayList.append(-5.0);
        arrayList.append(8.0);
        arrayList.append(4.0);
        arrayList.insert(2.0, 2);
        System.out.println(arrayList.toString());
        System.out.println();

        BasicStatistic basicStatistic = new BasicStatistic(arrayList);
        System.out.println("the max is: " + basicStatistic.max());
        System.out.println("the min is: " + basicStatistic.min());
        System.out.println("the average is: " + basicStatistic.mean());
        System.out.println("the variance is: " + basicStatistic.variance());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList myLinkedList = new MyLinkedList();
        myLinkedList.append(3.0);
        myLinkedList.append(6.0);
        myLinkedList.append(-5.0);
        myLinkedList.append(8.0);
        myLinkedList.append(4.0);
        myLinkedList.insert(2.0, 2);
        System.out.println(myLinkedList);
        System.out.println();

        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);
        System.out.println("the max is: " + basicStatistic.max());
        System.out.println("the min is: " + basicStatistic.min());
        System.out.println("the average is: " + basicStatistic.mean());
        System.out.println("the variance is: " + basicStatistic.variance());
    }
}
