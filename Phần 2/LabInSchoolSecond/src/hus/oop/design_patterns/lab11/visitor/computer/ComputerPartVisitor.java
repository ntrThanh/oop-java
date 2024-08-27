package hus.oop.design_patterns.lab11.visitor.computer;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);
}
