package hus.oop.exam1.studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }
                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */

                Student studentBuilder = new Student.StudentBuilder(dataList.getFirst())
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2)).withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.getLast()))
                        .build();
                StudentManager.getInstance().append(studentBuilder);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {
        System.out.println("origin data");
        System.out.println();
        testOriginalData();

        System.out.println();
        System.out.println("sort Math");
        testSortMathsGradeIncreasing();
        System.out.println();
        testSortMathsGradeDecreasing();


        System.out.println();
        System.out.println("sort physical");
        testSortPhysicsGradeIncreasing();
        System.out.println();
        testSortPhysicsGradeDecreasing();
    }

    public static void init() {
        String filePath = "C:\\Users\\Trong Thanh\\Downloads\\Exam\\Exam\\OOP_FinalExam_2023_De1\\data\\students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {
        init();
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        StudentManager.print(students);
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        StudentManager.print(students);
    }

    public static void testSortPhysicsGradeIncreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        StudentManager.print(students);
    }

    public static void testSortPhysicsGradeDecreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        StudentManager.print(students);
    }

    public static void testSortChemistryGradeIncreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        StudentManager.print(students);
    }

    public static void testSortChemistryGradeDecreasing() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        StudentManager.print(students);
    }

    public static void testFilterStudentsHighestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {
        init();
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsHighestPhysicsGrade(5);
        StudentManager.print(students);
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsLowestPhysicsGrade(5);
        StudentManager.print(students);
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsHighestChemistryGrade(5);
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsLowestChemistryGrade(5);
        StudentManager.print(students);
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsHighestMathsGrade(5);
        StudentManager.print(students);
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        init();
        List<Student> students = StudentManager.getInstance().filterStudentsLowestAverageGrade(5);
        StudentManager.print(students);
    }
}
