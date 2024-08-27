package hus.oop.lab6.secondpoint;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Point getBegin() {
        return super.getPoint();
    }

    public void setBegin(Point begin) {
        super.setPoint(begin);
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }

    public void setBeginY(int beginY) {
        super.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setXY(endX, endY);
    }

    @Override
    public String toString() {
        return "Line[" +
                "begin=(" + super.getX() + "," + super.getY() + "), " +
                "end=(" + end.getX() + "," + end.getY() + ")]";
    }

    public double getLength() {
        return Math.sqrt(
                Math.pow((super.getX() - end.getX()), 2) +
                        Math.pow((super.getY() - end.getY()), 2));
    }

    public double getGradient() {
        return Math.atan2(
                (super.getY() - end.getY()),
                (super.getX() - end.getY()));
    }
}
