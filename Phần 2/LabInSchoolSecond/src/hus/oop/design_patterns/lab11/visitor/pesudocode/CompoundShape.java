package hus.oop.design_patterns.lab11.visitor.pesudocode;

import java.util.LinkedList;
import java.util.List;

public class CompoundShape implements Shape {
    private List<Shape> shapesList;

    public CompoundShape(List<Shape> shapesList) {
        this.shapesList = shapesList;
    }

    public CompoundShape() {
        shapesList = new LinkedList<>();
    }

    @Override
    public void move(int x, int y) {
        for (Shape shape : shapesList) {
            shape.move(x, y);
        }
    }

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public void setShapesList(List<Shape> shapesList) {
        this.shapesList = shapesList;
    }

    public void add(Shape shape) {
        shapesList.add(shape);
    }

    public void remove(Shape shape) {
        shapesList.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapesList) {
            shape.draw();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
