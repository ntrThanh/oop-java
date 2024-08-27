package hus.oop.design_patterns.lab11.visitor.pesudocode;

public interface Visitor {
    void visit(Dot dot);

    void visit(Rectangle rectangle);

    void visit(Circle circle);

    void visit(CompoundShape compoundShape);
}
