package hus.oop.design_patterns.lab11.abstractfactory.shape;

public class ShapeFactory implements AbstractFactory {
    private String type;

    public ShapeFactory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Shape getShape() throws Exception {
        if (type.equals("rectangle")) {
            return new Rectangle();
        } else if (type.equals("square")) {
            return new Square();
        } else {
            throw new Exception("such shape");
        }
    }
}
