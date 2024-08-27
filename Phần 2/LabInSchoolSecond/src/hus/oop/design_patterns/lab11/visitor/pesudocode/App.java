package hus.oop.design_patterns.lab11.visitor.pesudocode;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dot dot = new Dot();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        CompoundShape compoundShape = new CompoundShape();
        compoundShape.add(dot);
        compoundShape.add(circle);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(dot);
        shapes.add(circle);
        shapes.add(compoundShape);

        for (Shape shape : shapes) {
            shape.accept(new XMLExportVisitor());
        }
    }
}
