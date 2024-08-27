package hus.oop.design_patterns.lab11.visitor.computer;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
