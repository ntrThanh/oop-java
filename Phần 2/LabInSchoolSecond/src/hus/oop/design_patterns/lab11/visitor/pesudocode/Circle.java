package hus.oop.design_patterns.lab11.visitor.pesudocode;

public class Circle implements Shape {
    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
