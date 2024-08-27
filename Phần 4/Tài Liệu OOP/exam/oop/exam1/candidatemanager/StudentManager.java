package hus.oop.exam1.candidatemanager;

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
        this.studentList.append(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        this.studentList.insert(student, index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        this.studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return (Student) studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public MyList sortMathsGradeIncreasing() {
        /* TODO */
        MyList listStudents = new MyArrayList();
        listStudents.addAll(studentList);

        for (int i = 0; i < listStudents.size() - 1; i++) {
            for (int j = i + 1; j < listStudents.size(); j++) {
                if (((Student) listStudents.get(i)).getMathsGrade()
                        > ((Student) listStudents.get(j)).getMathsGrade()) {
                    Student temp = (Student) listStudents.get(i);
                    listStudents.set(listStudents.get(j), i);
                    listStudents.set(temp, j);
                }
            }
        }

        return listStudents;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public MyList sortMathsGradeDecreasing() {
        /* TODO */
        MyList listStudents = new MyArrayList();
        listStudents.addAll(studentList);

        for (int i = 0; i < listStudents.size() - 1; i++) {
            for (int j = i + 1; j < listStudents.size(); j++) {
                if (((Student) listStudents.get(i)).getMathsGrade()
                        < ((Student) listStudents.get(j)).getMathsGrade()) {
                    Student temp = (Student) listStudents.get(i);
                    listStudents.set(listStudents.get(j), i);
                    listStudents.set(temp, j);
                }
            }
        }

        return listStudents;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public MyList sortAverageGradeIncreasing() {
        /* TODO */
        MyList listStudents = new MyArrayList();
        listStudents.addAll(studentList);

        for (int i = 0; i < listStudents.size() - 1; i++) {
            for (int j = i + 1; j < listStudents.size(); j++) {
                if (((Student) listStudents.get(i)).getAverage()
                        > ((Student) listStudents.get(j)).getAverage()) {
                    Student temp = (Student) listStudents.get(i);
                    listStudents.set(listStudents.get(j), i);
                    listStudents.set(temp, j);
                }
            }
        }

        return listStudents;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public MyList sortAverageGradeDecreasing() {
        /* TODO */
        MyList listStudents = new MyArrayList();
        listStudents.addAll(studentList);

        for (int i = 0; i < listStudents.size() - 1; i++) {
            for (int j = i + 1; j < listStudents.size(); j++) {
                if (((Student) listStudents.get(i)).getAverage()
                        < ((Student) listStudents.get(j)).getAverage()) {
                    Student temp = (Student) listStudents.get(i);
                    listStudents.set(listStudents.get(j), i);
                    listStudents.set(temp, j);
                }
            }
        }

        return listStudents;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public MyList filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        MyList listStudents = sortMathsGradeDecreasing();
        MyList result = new MyArrayList();

        for (int i = 0; i < howMany; i++) {
            result.append(listStudents.get(i));
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
        MyList listStudents = sortMathsGradeIncreasing();
        MyList result = new MyArrayList();

        for (int i = 0; i < howMany; i++) {
            result.append(listStudents.get(i));
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
        MyList listStudents = sortAverageGradeDecreasing();
        MyList result = new MyArrayList();

        for (int i = 0; i < howMany; i++) {
            result.append(listStudents.get(i));
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
        MyList listStudents = sortAverageGradeIncreasing();
        MyList result = new MyArrayList();

        for (int i = 0; i < howMany; i++) {
            result.append(listStudents.get(i));
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
