package hus.oop.design_patterns.lab11.iterator.example;

import java.util.LinkedList;
import java.util.List;

public class StudentManager implements Iterable {
    private final List<Student> students;

    public StudentManager() {
        this.students = new LinkedList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    @Override
    public Iterator getIterator() {
        Student[] students1 = new Student[students.size()];
        return new StudentIterator(students.toArray(students1));
    }
}
