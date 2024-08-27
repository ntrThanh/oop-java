package hus.oop.design_patterns.lab11.iterator.example;

public class StudentIterator implements Iterator {
    private final Student[] students;
    private int count;

    public StudentIterator(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return count < students.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return students[count++];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
