package com.vn.example.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Graphic> list = new ArrayList<>();
        list.add(new Dot(1, 2));
        list.add(new Dot(1, 24));
        list.add(new Dot(1, 3));
        list.add(new Circle(1, 2, 3));
        CompoundGraphic graphic = new CompoundGraphic(list);

        // them du lieu
        CompoundGraphic compound = new CompoundGraphic();
        compound.add(new Dot(5, 6));
        compound.add(graphic);

        compound.draw();
    }
}
