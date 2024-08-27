package hus.oop.designpatterns.observer.example;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Class> list = new LinkedList<>();

        list.add(new SubClass());
        list.add(new SubClass());
        list.add(new SubClass());
        list.add(new SubClass());

        Teacher teacher = new Teacher(list, new Exam("dawn a lion", "first Exam"));
        teacher.notifyExam();

        teacher.updateExam(new Exam("drawn a monkey", "second exam"));
        teacher.notifyExam();
    }
}
