package hus.oop.lab7.thirdpoint;

public class TestMain {
    public static void main(String[] args) {
        Movable movableCircle = new MovableCircle(10, new MovablePoint(1, 2, 2, 3));
        System.out.println(movableCircle);
        System.out.println();

        movableCircle.moveLeft();
        movableCircle.moveRight();
        movableCircle.moveUp();
        movableCircle.moveDown();
        System.out.println(movableCircle);
        System.out.println();

        Movable movableRectangle = new MovableRectangle(1, 2, 3, 4, 12, 12);
        System.out.println(movableRectangle);
        System.out.println();

        movableRectangle.moveDown();
        movableRectangle.moveUp();
        System.out.println(movableRectangle);
    }
}
