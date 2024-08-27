package hus.oop.design_patterns.lab11.abstractfactory.shape;

public class RoundedShapeFactory implements AbstractFactory {
    private String type;

    public RoundedShapeFactory(String type) {
        this.type = type;
    }

    public RoundedShapeFactory() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Shape getShape() throws Exception {
        if (type.equals("rounded rectangle")) {
            return new RoundedRectangle();
        } else if (type.equals("rounded square")) {
            return new RoundedSquare();
        } else {
            throw new Exception("no shape");
        }
    }
}
