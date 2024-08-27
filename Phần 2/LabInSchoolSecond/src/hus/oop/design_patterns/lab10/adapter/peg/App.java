package hus.oop.design_patterns.lab10.adapter.peg;

public class App {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);

        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));
        System.out.println();

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        //Can not compile System.out.println(hole.fits(smallSquarePeg));

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(largeSquarePeg);

        System.out.println(hole.fits(squarePegAdapter1));
        System.out.println(hole.fits(squarePegAdapter));
    }
}
