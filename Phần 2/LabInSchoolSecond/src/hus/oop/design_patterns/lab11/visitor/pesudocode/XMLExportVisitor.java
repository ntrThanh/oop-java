package hus.oop.design_patterns.lab11.visitor.pesudocode;

public class XMLExportVisitor implements Visitor {
    @Override
    public void visit(Dot dot) {
        System.out.println("visitor in dot");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("visi;tor in rectangle");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("visitor in circle");
    }

    @Override
    public void visit(CompoundShape compoundShape) {
        for (Shape shape : compoundShape.getShapesList()) {
            shape.accept(this);
        }
    }
}
