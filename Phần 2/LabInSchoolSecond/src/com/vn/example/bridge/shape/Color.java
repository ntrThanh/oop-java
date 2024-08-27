package com.vn.example.bridge.shape;

public abstract class Color {
    protected String color;
    protected String uses;

    public Color(String color) {
        this.color = color;
    }

     public Color(String color, String uses) {
          this.color = color;
          this.uses = uses;
     }

     public abstract String getColor();
    public abstract String setColor();
}
