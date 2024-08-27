package hus.oop.exam1.studentmanager;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        studentList = new LinkedList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }

        return instance;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        this.studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        this.studentList.add(index, student);
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
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        this.studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return this.studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự năm sinh tăng dần.
     * @return
     */
    public List<Student> sortYearOfBirthIncreasing() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getYearOfBirth))
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp sinh viên theo thứ tự năm sinh giảm dần.
     * @return
     */
    public List<Student> sortYearOfBirthDecreasing() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getYearOfBirth).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getMathsGrade).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getMathsGrade))
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        /* TODO */
        return studentList.stream().sorted(Comparator
                .comparing(Student::getPhysicsGrade))
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        /* TODO */
        return studentList.stream().sorted(Comparator
                        .comparing(Student::getPhysicsGrade).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        /* TODO */
        return studentList.stream().sorted(Comparator
                        .comparing(Student::getChemistryGrade))
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        /* TODO */
        return studentList.stream().sorted(Comparator
                        .comparing(Student::getChemistryGrade).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        return studentList.stream().sorted(Comparator
                        .comparing(Student::getAverage))
                .collect(Collectors.toList());
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        return studentList.stream().sorted(Comparator
                        .comparing(Student::getAverage).reversed())
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortPhysicsGradeDecreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra những sinh viên có điểm lý cao hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanPhysicsGrade(double lowerBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getPhysicsGrade() > lowerBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortPhysicsGradeIncreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanPhysicsGrade(double upperBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getPhysicsGrade() < upperBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortMathsGradeDecreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao thấp hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanMathsGrade(int lowerBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getMathsGrade() > lowerBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestMathsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortMathsGradeIncreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanMathsGrade(double upperBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getMathsGrade() < upperBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortChemistryGradeDecreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanChemistryGrade(int lowerBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getMathsGrade() > lowerBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortChemistryGradeIncreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanChemistryGrade(int upperBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getChemistryGrade() < upperBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortAverageGradeDecreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm bình cao hơn lowerBoundGrade.
     * @param lowerBoundGrade
     * @return
     */
    public List<Student> filterStudentsHigherThanAverageGrade(int lowerBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getAverage() > lowerBoundGrade)
                .collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = sortAverageGradeIncreasing();
        return listStudent.stream().limit(howMany).collect(Collectors.toList());
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp hơn upperBoundGrade.
     * @param upperBoundGrade
     * @return
     */
    public List<Student> filterStudentsLowerThanAverageGrade(int upperBoundGrade) {
        /* TODO */
        return studentList.stream()
                .filter(Student -> Student.getAverage() < upperBoundGrade)
                .collect(Collectors.toList());
    }

    public static String idOfStudentsToString(List<Student> studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");

        for (Student student : studentList) {
            idOfStudents.append(student.getId()).append(" ");
        }

        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");

        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }

        System.out.print(studentsString.toString().trim() + "\n]");
        System.out.println();
    }
}
