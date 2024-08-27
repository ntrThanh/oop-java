package hus.oop.lab4.line;

public class TestMain {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(3, 4);
        System.out.println(begin);
        MyPoint end = new MyPoint(1, 2);
        System.out.println(end);

        MyLine myLine = new MyLine(begin, end);
        System.out.println(myLine);

        System.out.println("beginX is: " + begin.getX());
        System.out.println("beginY is: " + begin.getY());
        System.out.println("endX is: " + end.getX());
        System.out.println("endY is: " + end.getY());

        System.out.println("length is: " + myLine.getLength());
        System.out.println("the gradient is: " + myLine.getGradient());

        myLine.setBeginX(10);
        System.out.println("length is: " + myLine.getLength());
        myLine.setEndX(12);
        System.out.println("length is: " + myLine.getLength());
    }
}
