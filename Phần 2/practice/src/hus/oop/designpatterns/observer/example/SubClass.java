package hus.oop.designpatterns.observer.example;

public class SubClass implements Class {
    private Exam exam;

    public SubClass() {
        exam = new Exam("", "");
    }

    @Override
    public void update(Teacher teacher) {
        this.exam = teacher.getExam();
        printInfoOfClass();
    }

    public void printInfoOfClass() {
        System.out.println("exam for first " +
                            "subclass is " +
                            exam.getName() +
                            " with data is " +
                            exam.getData());
    }
}
