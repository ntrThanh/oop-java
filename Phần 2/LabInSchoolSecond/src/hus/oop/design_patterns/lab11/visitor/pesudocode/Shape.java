package hus.oop.design_patterns.lab11.visitor.pesudocode;

public interface Shape {
    void move(int x, int y);

    void draw();

    void accept(Visitor visitor);
}
