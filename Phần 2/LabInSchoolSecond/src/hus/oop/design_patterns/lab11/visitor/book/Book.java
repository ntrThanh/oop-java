package hus.oop.design_patterns.lab11.visitor.book;

public interface Book {
    void accept(Visitor visitor);
}
