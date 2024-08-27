package hus.oop.lab6.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Trong Thanh", "Ha Noi");
        System.out.println(person);
        System.out.println();

        Student student = new Student("Nguyen Trong Thanh", "Ha Noi", "Student Manager", 2005, 100000);
        System.out.println(student);
        System.out.println();

        Staff staff =new Staff("Nguyen Trong Thanh", "Ha Noi", "Ha Noi University of Science", 100000);
        System.out.println(staff);
    }
}
