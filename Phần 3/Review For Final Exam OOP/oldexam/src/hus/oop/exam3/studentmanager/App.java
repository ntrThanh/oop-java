package hus.oop.exam3.studentmanager;

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
                Student student = new Student.StudentBuilder(dataList.getFirst())
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                StudentManager.getInstance().append(student);
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
        testOriginalData();
        testSortYearOfBirthIncreasing();
        testSortYearOfBirthDecreasing();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortPhysicsGradeIncreasing();
        testSortPhysicsGradeDecreasing();
        testSortChemistryGradeIncreasing();
        testSortChemistryGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
        testFilterStudentsHighestPhysicsGrade();
        testFilterStudentsLowestPhysicsGrade();
        testFilterStudentsHighestChemistryGrade();
        testFilterStudentsLowestChemistryGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();
    }

    public static void init() {
        String filePath = "C:\\Users\\Trong Thanh\\Downloads\\" +
                "Exam\\Exam\\OOP_FinalExam_2023_De1\\data\\students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        System.out.println("testOriginalData");
        StudentManager.print(StudentManager.getInstance().getStudentList());
    }

    public static void testSortYearOfBirthIncreasing() {
        System.out.println("testSortYearOfBirthIncreasing");
        StudentManager.print(StudentManager.getInstance().sortYearOfBirthIncreasing());
    }

    public static void testSortYearOfBirthDecreasing() {
        System.out.println("testSortYearOfBirthDecreasing");
        StudentManager.print(StudentManager.getInstance().sortYearOfBirthDecreasing());
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        System.out.println("testSortMathsGradeIncreasing");
        StudentManager.print(StudentManager.getInstance().sortMathsGradeIncreasing());
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        System.out.println("testSortMathsGradeDecreasing");
        StudentManager.print(StudentManager.getInstance().sortMathsGradeDecreasing());
    }

    public static void testSortPhysicsGradeIncreasing() {
        /* TODO */
        System.out.println("testSortPhysicsGradeIncreasing");
        StudentManager.print(StudentManager.getInstance().sortPhysicsGradeIncreasing());
    }

    public static void testSortPhysicsGradeDecreasing() {
        /* TODO */
        System.out.println("testSortPhysicsGradeDecreasing");
        StudentManager.print(StudentManager.getInstance().sortPhysicsGradeDecreasing());
    }

    public static void testSortChemistryGradeIncreasing() {
        /* TODO */
        System.out.println("testSortChemistryGradeIncreasing");
        StudentManager.print(StudentManager.getInstance().sortChemistryGradeIncreasing());
    }

    public static void testSortChemistryGradeDecreasing() {
        /* TODO */
        System.out.println("testSortChemistryGradeDecreasing");
        StudentManager.print(StudentManager.getInstance().sortChemistryGradeDecreasing());
    }

    public static void testFilterStudentsHighestMathsGrade() {
        System.out.println("testFilterStudentsHighestMathsGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsHighestMathsGrade(5));
    }

    public static void testFilterStudentsLowestMathsGrade() {
        System.out.println("testFilterStudentsLowestMathsGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowestMathsGrade(5));
    }

    public static void testFilterStudentsHighestPhysicsGrade() {
        /* TODO */
        System.out.println("testFilterStudentsHighestPhysicsGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsHighestPhysicsGrade(5));
    }

    public static void testFilterStudentsLowestPhysicsGrade() {
        /* TODO */
        System.out.println("testFilterStudentsLowestPhysicsGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowestPhysicsGrade(5));
    }

    public static void testFilterStudentsHighestChemistryGrade() {
        /* TODO */
        System.out.println("testFilterStudentsHighestChemistryGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsHighestChemistryGrade(5));
    }

    public static void testFilterStudentsLowestChemistryGrade() {
        /* TODO */
        System.out.println("testFilterStudentsLowestChemistryGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowestChemistryGrade(5));
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        System.out.println("testFilterStudentsHighestAverageGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsHighestAverageGrade(5));
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        System.out.println("testFilterStudentsLowestAverageGrade");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowestAverageGrade(5));
    }
}
