package lab5;

import java.util.*;

public class TestStaticClassInJava {

    public ArrayList<Outer> outList;

    public TestStaticClassInJava() {
        outList = new ArrayList<Outer>();
    }

    public static class Outer {
        int number;

        public Outer(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void printNumber() {
            System.out.println("Number out: " + number);
        }
    }

    public void addNumber(int number) {
        Outer outNumber = new Outer(number);
        outList.add(outNumber);
    }

    public void printData() {
        for (Outer outer : outList) {
            outer.printNumber();
        }
    }

    public static void main(String[] args) {
        TestStaticClassInJava test = new TestStaticClassInJava();
        test.addNumber(0);
        test.addNumber(2);
        test.printData();
    }
}