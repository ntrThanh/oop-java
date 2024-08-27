package hus.oop.review.test;

import hus.oop.review.collection.*;
import hus.oop.review.iterator.MyIterator;
import hus.oop.review.student.Student;

public class TestMain {

    public static void main(String[] args) {
        new TestMain().testMyArrayList();
    }

    public void testIterator(MyList list) {
        System.out.println("Test iterator ----------------------------------------\\");
        MyIterator myIterator = list.iterator();

        while(myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        System.out.println("The size is: " + list.size());
        System.out.println("------------------------------------------------------/");
        System.out.println();
    }

    public void testMyArrayList() {
        MyList listStudent = new MyArrayList();
        listStudent.append(new Student("A", "Nguyen Van", 9));
        listStudent.append(new Student("B", "Nguyen Van", 10));
        listStudent.append(new Student("C", "Nguyen Van", 17));

        testIterator(listStudent);

        listStudent.remove(1);
        listStudent.append(new Student("F", "Nguyen Dang", 9));
        listStudent.append(new Student("L", "Nguyen Dang", 9));
        listStudent.insert(new Student("G", "Nguyen Thanh", 9), 0);

        testIterator(listStudent);
    }

    public void testMyLinkedList() {
        MyList listStudent = new MyLinkedList();
        listStudent.append(new Student("A", "Nguyen Van", 9));
        listStudent.append(new Student("B", "Nguyen Van", 10));
        listStudent.append(new Student("C", "Nguyen Van", 17));

        testIterator(listStudent);

        listStudent.remove(1);
        listStudent.append(new Student("F", "Nguyen Dang", 9));
        listStudent.append(new Student("L", "Nguyen Dang", 9));
        listStudent.insert(new Student("G", "Nguyen Thanh", 9), 0);

        testIterator(listStudent);
    }
}
