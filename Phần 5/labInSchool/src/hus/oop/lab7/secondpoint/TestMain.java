package hus.oop.lab7.secondpoint;

public class TestMain {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(10, new MovablePoint(2, 3, 10, 10));
        System.out.println(movableCircle);
        System.out.println();

        movableCircle.moveUp();
        movableCircle.moveDown();
        System.out.println(movableCircle);

        System.out.println("The radius is: " + movableCircle.getRadius());
        System.out.println();
    }
}
