package hus.oop.exam3.mybookmanager;

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

        Viết code để test cho tất cả các hàm bên dưới.
        Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
        nộp lên classroom.
         */
        testPriceOfBooksIncreasing();
        testPriceOfBooksDecreasing();
        testSortPagesOfBookIncreasing();
        testSortPagesOfBookDecreasing();
    }

    public static void init() {
        String filePath = "C:\\Users\\Trong Thanh\\Downloads\\Exam\\Exam" +
                "\\OOP_HK2_2223_FinalExam_De3\\data\\books.csv";
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
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để quản lý.
                */
                //title,author,genre,pages,price,publisher

                Book book = new Book.BookBuilder(dataList.getFirst())
                        .withAuthor(dataList.get(1))
                        .withGenre(dataList.get(2))
                        .withPages(Integer.parseInt(dataList.get(3)))
                        .withPrice(Double.parseDouble(dataList.get(4)))
                        .withPublisher(dataList.getLast())
                        .build();
                BookManager.getInstance().append(book);
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
        BookManager.print(BookManager.getInstance().getBookList());
    }

    public static void testSortPagesOfBookIncreasing() {
        /* TODO */
        System.out.println("page increasing");
        BookManager.print(BookManager.getInstance().sortPagesIncreasing());
    }

    public static void testSortPagesOfBookDecreasing() {
        /* TODO */
        System.out.println("page decreasing");
        BookManager.print(BookManager.getInstance().sortPagesDecreasing());
    }

    public static void testPriceOfBooksIncreasing() {
        /* TODO */
        System.out.println("price increasing");
        BookManager.print(BookManager.getInstance().sortPriceIncreasing());
    }

    public static void testPriceOfBooksDecreasing() {
        /* TODO */
        System.out.println("price decreasing");
        BookManager.print(BookManager.getInstance().sortPriceDecreasing());
    }

    public static void testFilterBooksOfAuthor() {
        /* TODO */
    }

    public static void testFilterBooksOfPublisher() {
        /* TODO */
    }

    public static void testFilterBooksOfGenre() {
        /* TODO */
    }
}
