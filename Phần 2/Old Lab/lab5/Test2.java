package lab5;

public class Test2 {
    public static void upNumber(int number) {
        number++;
    }

    public static void main(String ags[]) {
        Number num = new Number(10);
        System.out.println(num);
        num.upNumber();
        System.out.println(num.toString());
    }
}

class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void upNumber() {
        this.number = number + 1;
    }

    @Override
    public String toString() {
        return number + "";
    }
}
