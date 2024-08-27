package hus.oop.exam2.studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        testOriginalData();

        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
        nộp lên classroom.
         */

        testSortYearOfBirthIncreasing();
        testSortYearOfBirthDecreasing();
        testSortAverageGradeIncreasing();
        testSortAverageGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
    }

    public static void init() {
        String filePath = "C:\\Users\\Trong Thanh\\Downloads\\Exam\\Exam" +
                "\\OOP_HK2_2223_FinalExam_De2-2\\data\\students.csv";
        readListData(filePath);
    }

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
                        .withChemistryGrade(Double.parseDouble(dataList.getLast()))
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

    public static void testOriginalData() {
        init();
        StudentManager.print(StudentManager.getInstance().getStudentList());
    }

    public static void testSortYearOfBirthIncreasing() {
        /* TODO */
        System.out.println("birthday increasing");
        StudentManager.print(StudentManager.getInstance().sortYearOfBirthIncreasing());
    }

    public static void testSortYearOfBirthDecreasing() {
        /* TODO */
        System.out.println("birthday decreasing");
        StudentManager.print(StudentManager.getInstance().sortYearOfBirthIncreasing());
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        System.out.println("average increasing");
        StudentManager.print(StudentManager.getInstance().sortAverageGradeIncreasing());
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        System.out.println("average decreasing");
        StudentManager.print(StudentManager.getInstance().sortAverageGradeDecreasing());
    }

    public static void testFilterStudentsHighestMathsGrade() {
        /* TODO */
        System.out.println("highest math");
        StudentManager.print(StudentManager.getInstance().filterStudentsHighestMathsGrade(5));
    }

    public static void testFilterStudentsLowestMathsGrade() {
        /* TODO */
        System.out.println("lowest math");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowestMathsGrade(5));
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        System.out.println("highest average");
        StudentManager.print(StudentManager.getInstance().filterStudentsHighestAverageGrade(5));
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        System.out.println("lowest average");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowestAverageGrade(5));
    }

    public static void testFilterStudentsHigherThanAverageGrade() {
        /* TODO */
        System.out.println("higher than");
        StudentManager.print(StudentManager.getInstance().filterStudentsHigherThanAverageGrade(8));
    }

    public static void testFilterStudentsLowerThanAverageGrade() {
        /* TODO */
        System.out.println("lower than");
        StudentManager.print(StudentManager.getInstance().filterStudentsLowerThanAverageGrade(8));
    }
}
