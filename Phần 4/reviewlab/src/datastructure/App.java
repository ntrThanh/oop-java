package datastructure;

public class App {
    public static void main(String[] args) {
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */

        testStack();
        // testQueue();
    }

    public static void testStack() {
        /* TODO */
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(13);
        stack.push(19);
        stack.push(0);
        stack.push(11);
        stack.push(12);
        stack.push(4);
        stack.push(5);
        stack.push(11);
        stack.push(88);
        stack.push(1112);
        stack.push(13);
        stack.push(11);
        stack.push(0);
        stack.push(111);

        System.out.println(stack);

        for (int i = 0; i < 5; i++) {
            stack.pop();
        }
        System.out.println(stack);
    }

    public static void testQueue() {
        /* TODO */
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(13);
        queue.add(19);
        queue.add(0);
        queue.add(11);
        queue.add(12);
        queue.add(4);
        queue.add(5);
        queue.add(11);
        queue.add(88);
        queue.add(1112);
        queue.add(13);
        queue.add(11);
        queue.add(0);
        queue.add(111);

        System.out.println(queue);

        for (int i = 0; i < 5; i++) {
            queue.remove();
        }

        System.out.println(queue);
    }
}
