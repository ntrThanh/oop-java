package com.vn.example.bridge.shape;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Color color) {
        super(color);
    }

    @Override
    public double getArea() {
        return (double) Math.PI * radius * radius;
    }

    @Override
    public String getFullNameofShape() {
        return "The Shape is Circle and have radius = " + radius + " and have color is " + color.getColor();
    }
}
