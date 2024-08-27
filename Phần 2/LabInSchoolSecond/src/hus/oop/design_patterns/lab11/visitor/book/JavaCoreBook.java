package hus.oop.design_patterns.lab11.visitor.book;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return "resource";
    }

    public String getBestSeller() {
        return "best seller";
    }
}
