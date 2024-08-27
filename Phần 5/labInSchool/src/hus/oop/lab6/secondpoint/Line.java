package hus.oop.lab6.secondpoint;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setY(y);
        this.begin.setX(x);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    @Override
    public String toString() {
        return "Line[" +
                "begin=(" + begin.getX() + "," + begin.getY() + "), " +
                "end=(" + end.getX() + "," + end.getY() + ")]";
    }

    public double getLength() {
        return Math.sqrt(
                Math.pow((begin.getX() - end.getX()), 2) +
                Math.pow((begin.getY() - end.getY()), 2));
    }

    public double getGradient() {
        return Math.atan2(
                (begin.getY() - end.getY()),
                (begin.getX() - end.getY()));
    }
}
