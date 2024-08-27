package com.vn.example.bridge.shape;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getFullNameofShape() {
        return "The Shape is rectangle, have height = "
                + height + ", have width = "
                + width + " and have color is "
                + color.getColor();
    }
}
