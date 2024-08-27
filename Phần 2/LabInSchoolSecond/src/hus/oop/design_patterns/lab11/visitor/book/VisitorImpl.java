package hus.oop.design_patterns.lab11.visitor.book;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(ProgramingBook programingBook) {
        System.out.println("visitor in programing book");
    }

    @Override
    public void visit(DesignPatternBook designPatternBook) {
        System.out.println("visitor in design pattern book");
    }

    @Override
    public void visit(BusinessBook businessBook) {
        System.out.println("visitor in business book");
    }
}
