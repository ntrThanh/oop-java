package hus.oop.design_patterns.lab11.visitor.book;

public interface Visitor {
    void visit(ProgramingBook programingBook);

    void visit(DesignPatternBook designPatternBook);

    void visit(BusinessBook businessBook);
}
