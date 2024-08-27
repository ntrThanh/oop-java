package hus.oop.lab10.poly;

public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[] {0, 3, 0, 8});
        Poly lp = new ListPoly(new double[] {1, 3, 4, 8, });
        System.out.println("ap = " + ap);

        if (ap.toString().equals(lp.toString())
                && lp.toString().equals(ap.toString())) {
            System.out.println("ap == lp");
        } else {
            System.out.println("ap != lp");
        }

        ap = ap.derivative();
        System.out.println("After1 : " + ap);
        ap = ap.derivative();
        ap = ap.derivative();
        System.out.println("After2 : " + ap);

        System.out.println();
        lp = lp.derivative();
        System.out.println("After1 : " + lp);
        lp = lp.derivative();
        System.out.println("After2 : " + lp);
    }
}
