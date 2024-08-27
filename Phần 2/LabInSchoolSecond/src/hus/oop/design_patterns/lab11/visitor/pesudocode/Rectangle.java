package hus.oop.design_patterns.lab11.visitor.pesudocode;

public class Rectangle implements Shape {
    private final Dot dot1;
    private final Dot dot2;

    public Rectangle(Dot dot1, Dot dot2) {
        this.dot1 = dot1;
        this.dot2 = dot2;
    }

    public Rectangle() {
        dot1 = new Dot();
        dot2 = new Dot(2, 2);
    }

    @Override
    public void move(int x, int y) {
        dot1.move(x, y);
        dot2.move(x, y);
    }

    @Override
    public void draw() {
        System.out.println("drawn rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
