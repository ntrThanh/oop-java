package com.vn.example.bridge.shape;

public class RedColor extends Color {
    public RedColor(String color, String uses) {
        super(color, uses);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String setColor() {
        return uses;
    }
}
