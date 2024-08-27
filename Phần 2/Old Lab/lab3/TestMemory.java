// lấy ví dụ về truyền tham số trong java và trong c

package lab3;

public class TestMemory {

    public static int changeValue(int value) {
        System.out.println(value);  // trước khi thay đổi value có giá trị bằng 7
        value = 10; // sau khi thay đổi value có giá trị bằng 10
        return value;
    }

    public static void main(String[] args) {
        int value = 7;
        System.out.print(value);
        System.out.println("Before: " + value); // cơ chế truyền tham số trong java là truyền theo giá trị
        System.out.println("After: " + changeValue(value));
    }
}
