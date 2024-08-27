package hus.oop.lab7.shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
}
