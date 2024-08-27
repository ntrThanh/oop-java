package hus.oop.lab4.circle;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
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

    public int[] getXY() {
        return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) +
                            (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint point) {
        return Math.sqrt((point.getX() - x) * (point.getX() - x) +
                (point.getY() - y) * (point.getY() - y));
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
