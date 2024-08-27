package hus.oop.lab7.geometric;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() +
                "]";
    }

    @Override
    public void resize(int percent) {
        this.radius *= (double) percent / 100;
    }
}
