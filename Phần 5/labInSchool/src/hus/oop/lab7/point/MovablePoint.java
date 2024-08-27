package hus.oop.lab7.point;

public class MovablePoint extends Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    void moveUp() {
        this.y -= ySpeed;
    }

    @Override
    void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    void moveRight() {
        this.x += xSpeed;
    }

    @Override
    void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") speed=(" + x + "," + y + ")";
    }
}
