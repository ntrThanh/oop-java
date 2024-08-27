package hus.oop.exam2.candidatemanager;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private MyList studentList;

    private StudentManager() {
        studentList = new MyLinkedList();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }

        return instance;
    }

    public MyList getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        studentList.append(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.insert(student, index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        if (studentList.get(index) instanceof Student) {
            return (Student) studentList.get(index);
        }

        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public MyList sortMathsGradeIncreasing() {
        /* TODO */
        MyList listStudent = new MyArrayList();
        listStudent.addAll(studentList);

        for(int i = 0; i < listStudent.size() - 1; i++) {
            for(int j = i + 1; j < listStudent.size(); j++) {
                if (((Student) listStudent.get(i)).getMathsGrade()
                        > ((Student) listStudent.get(j)).getMathsGrade()) {
                    Student temp = (Student) listStudent.get(i);
                    listStudent.set(listStudent.get(j), i);
                    listStudent.set(temp, j);
                }
            }
        }
        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public MyList sortMathsGradeDecreasing() {
        /* TODO */
        MyList listStudent = new MyArrayList();
        listStudent.addAll(studentList);

        for(int i = 0; i < listStudent.size() - 1; i++) {
            for(int j = i + 1; j < listStudent.size(); j++) {
                if (((Student) listStudent.get(i)).getMathsGrade()
                        < ((Student) listStudent.get(j)).getMathsGrade()) {
                    Student temp = (Student) listStudent.get(i);
                    listStudent.set(listStudent.get(j), i);
                    listStudent.set(temp, j);
                }
            }
        }
        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public MyList sortAverageGradeIncreasing() {
        /* TODO */
        MyList listStudent = new MyArrayList();
        listStudent.addAll(studentList);

        for(int i = 0; i < listStudent.size() - 1; i++) {
            for(int j = i + 1; j < listStudent.size(); j++) {
                if (((Student) listStudent.get(i)).getAverageGrade()
                        > ((Student) listStudent.get(j)).getAverageGrade()) {
                    Student temp = (Student) listStudent.get(i);
                    listStudent.set(listStudent.get(j), i);
                    listStudent.set(temp, j);
                }
            }
        }
        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public MyList sortAverageGradeDecreasing() {
        /* TODO */
        MyList listStudent = new MyArrayList();
        listStudent.addAll(studentList);

        for(int i = 0; i < listStudent.size() - 1; i++) {
            for(int j = i + 1; j < listStudent.size(); j++) {
                if (((Student) listStudent.get(i)).getAverageGrade()
                        < ((Student) listStudent.get(j)).getAverageGrade()) {
                    Student temp = (Student) listStudent.get(i);
                    listStudent.set(listStudent.get(j), i);
                    listStudent.set(temp, j);
                }
            }
        }
        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        MyList listStudent = sortMathsGradeDecreasing();
        MyList result = new MyArrayList();

        for(int i = 0; i < howMany; i++) {
            result.append(listStudent.get(i));
        }

        return result;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsLowestMathsGrade(int howMany) {
        /* TODO */
        MyList listStudent = sortMathsGradeIncreasing();
        MyList result = new MyArrayList();

        for(int i = 0; i < howMany; i++) {
            result.append(listStudent.get(i));
        }

        return result;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        MyList listStudent = sortAverageGradeDecreasing();
        MyList result = new MyArrayList();

        for(int i = 0; i < howMany; i++) {
            result.append(listStudent.get(i));
        }

        return result;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        MyList listStudent = sortAverageGradeIncreasing();
        MyList result = new MyArrayList();

        for(int i = 0; i < howMany; i++) {
            result.append(listStudent.get(i));
        }

        return result;
    }

    public static String idOfStudentsToString(MyList studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        MyIterator it = studentList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            idOfStudents.append(student.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(MyList studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        MyIterator it = studentList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
        System.out.println();
    }
}
