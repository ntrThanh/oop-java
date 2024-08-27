package hus.oop.design_patterns.lab11.visitor.computer;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        for (ComputerPart computerPart : computer.getComputerParts()) {
            computerPart.accept(this);
        }
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("visitor in monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("visitor in mouse");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("visitor in key board");
    }
}
