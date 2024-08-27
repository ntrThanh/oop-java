package hus.oop.lab4.triangle;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }

    public double getPerimeter() {
        double length1 = v1.distance(v2);
        double length2 = v1.distance(v3);
        double length3 = v2.distance(v3);
        return length1 + length3 + length2;
    }

    public String getType() {
        double length1 = v1.distance(v2);
        double length2 = v1.distance(v3);
        double length3 = v2.distance(v3);

        if (Double.valueOf(length1).equals(length2) &&
                Double.valueOf(length1).equals(length3)) {
            return "equilateral";
        } else if (Double.valueOf(length1).equals(length2) ||
                Double.valueOf(length1).equals(length3) ||
                Double.valueOf(length2).equals(length3)) {
            return "Isosceles";
        } else {
            return "scalene";
        }
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }
}
