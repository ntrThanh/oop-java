package hus.oop.design_patterns.lab11.visitor.book;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return "publisher";
    }
}
