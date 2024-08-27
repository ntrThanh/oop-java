package hus.oop.design_patterns.lab10.adapter.peg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super((int) Math.sqrt(2 * squarePeg.getWidth() * squarePeg.getWidth()) / 2);
        this.squarePeg = squarePeg;
    }

    public SquarePegAdapter(int radius) {
        super(radius);
    }

    @Override
    public int getRadius() {
        return (int) Math.sqrt(2 * squarePeg.getWidth() * squarePeg.getWidth()) / 2;
    }
}
