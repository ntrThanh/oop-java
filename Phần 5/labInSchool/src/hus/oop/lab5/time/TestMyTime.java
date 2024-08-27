package hus.oop.lab5.time;

import java.net.MalformedURLException;
public class TestMyTime {
    public static void main(String[] args) throws MalformedURLException {
        MyTime myTime1 = new MyTime(23, 59, 59);
        MyTime myTime2 = new MyTime(23, 58, 59);
        System.out.println(myTime1);
        System.out.println(myTime2);

        System.out.println();
        myTime1.nextSecond();
        System.out.println(myTime1);

        System.out.println();
        myTime2.nextHour();
        System.out.println(myTime2);
    }
}
