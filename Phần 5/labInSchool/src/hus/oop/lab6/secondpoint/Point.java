package hus.oop.lab6.secondpoint;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point getPoint() {
        return this;
    }

    public void setPoint(Point newPoint) {
        this.setXY(newPoint.getX(), newPoint.getY());
    }

    @Override
    public String toString() {
        return "Point: (" + this.x + "," + this.y + ")";
    }
}
