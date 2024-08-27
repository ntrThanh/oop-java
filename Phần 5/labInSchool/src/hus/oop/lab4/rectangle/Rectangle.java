package hus.oop.lab4.rectangle;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        length = 1f;
        width = 1f;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
