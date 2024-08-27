package hus.oop.designpatterns.observer.example;

import java.util.LinkedList;
import java.util.List;

public class Teacher {
    private List<Class> listClass;
    private Exam exam;

    public Teacher() {
        listClass = new LinkedList<>();
    }

    public Teacher(List<Class> listStudents, Exam exam) {
        this.listClass = listStudents;
        this.exam = exam;
    }

    public void addClass(Class c) {
        listClass.add(c);
    }

    public void removeClass(Class c) {
        listClass.remove(c);
    }

    public List<Class> getListClass() {
        return listClass;
    }

    public void setListClass(List<Class> listClass) {
        this.listClass = listClass;
    }

    public Exam getExam() {
        return exam;
    }

    public void updateExam(Exam exam) {
        System.out.println();
        this.exam = exam;
    }

    public void notifyExam() {
        System.out.println("Notify all class that they have new exam!");
        for(Class c : listClass) {
            c.update(this);
        }
    }
}
