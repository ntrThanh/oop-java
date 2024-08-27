package oop.principles.abstraction;

public interface Movable {
    /*
        khai báo giao diện bằng từ khóa interface
        giao diện được ví như bản hợp đồng, những lớp nào thực thi nó thì
        phải ghi đè tất cả các phương thức trừu trượng của nó
    */
    int speed = 100; // biến tĩnh không thể thay đổi

    /*
        tất cả các phương thức trong interface là trừu tượng,
        có trường trong lớp thì sẽ là static final
        nếu không có access modifier thì mặc định các phương thức sẽ là public abstract
    */
    /*public abstract*/ void moveUp();
    void moveDown();
}
