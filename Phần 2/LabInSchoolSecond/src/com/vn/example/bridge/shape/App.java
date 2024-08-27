package com.vn.example.bridge.shape;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor("red", "border"), 12);
        System.out.println(circle.getFullNameofShape());

        //...
    }
}
