package com.vn.example.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new CarBuilder();
        director.makeSUV(builder);
        Product car = builder.getResult();
    }
}
