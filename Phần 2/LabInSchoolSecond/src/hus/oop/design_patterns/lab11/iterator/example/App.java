package hus.oop.design_patterns.lab11.iterator.example;

public class App {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Nguyen Van A", "1 - 12 - 2005", 3.4));
        studentManager.addStudent(new Student("Nguyen Van B", "1 - 4 - 2005", 3.2));
        studentManager.addStudent(new Student("Nguyen Van C", "6 - 9 - 2005", 2.4));
        studentManager.addStudent(new Student("Nguyen Van D", "3 - 4 - 2005", 3.8));

        Iterator iterator = studentManager.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
