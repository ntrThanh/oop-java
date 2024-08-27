package hus.oop.bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    private static final BookManager bookManager = new BookManager();

    public static void main(String[] args) {
        init();
        testOriginalData();

        System.out.println();
        testFilterBooksLowestPrice();
        testFilterBooksHighestPrice();

        testPriceOfBooksDecreasing();
        testPriceOfBooksIncreasing();

        testFilterBooksOfAuthor();
        testFilterBooksOfGenre();
        testFilterBooksOfPublisher();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BookManager>.txt (Ví dụ, NguyenVanA_123456_BookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookManager>.zip (Ví dụ, NguyenVanA_123456_BookManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "C:\\Users\\Trong Thanh\\Downloads\\OOP_De1\\data\\books.csv";
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

                String title = dataList.getFirst().trim();
                String author = dataList.get(1).trim();
                String genre = dataList.get(2).trim();
                int pages = Integer.parseInt(dataList.get(3).trim());
                double price = Double.parseDouble(dataList.get(4).trim());
                String publisher = dataList.get(5).trim();

                Book book = new Book.BookBuilder(title).withAuthor(author).withGenre(genre).withPages(pages).withPrice(price).withPublisher(publisher).build();
                bookManager.append(book);
                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào bookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
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
        List<Book> books = bookManager.getBookList();
        System.out.print(books);
    }

    /**
     * Test sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, sau đó theo giá giảm dần.
     */
    public static void testSortIncreasingGenreAndPrice() {
        /* TODO */
        //List<Book> listBook = bookManager.
    }

    /**
     * Test sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, sau đó theo giá giảm dần.
     */
    public static void testSortDecreasingGenreAndPrice() {
        /* TODO */
    }

    /**
     * Test sắp xếp sách theo giá tăng dần.
     */
    public static void testPriceOfBooksIncreasing() {
        /* TODO */
        System.out.println("testPriceOfBooksIncreasing");
        List<Book> listBook = bookManager.sortIncreasingPrice();
        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    /**
     * Test sắp xếp sách theo giá giảm dần
     */
    public static void testPriceOfBooksDecreasing() {
        /* TODO */
        System.out.println("testPriceOfBooksDecreasing");
        List<Book> listBook = bookManager.sortDecreasingPrice();
        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    /**
     * Test lọc sách có giá rẻ nhất.
     */
    public static void testFilterBooksLowestPrice() {
        /* TODO */
        System.out.println("testFilterBooksLowestPrice");
        List<Book> listBookAfterSortPrice = bookManager.sortIncreasingPrice();
        Book tempBook = listBookAfterSortPrice.getFirst();

        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < listBookAfterSortPrice.size(); i++) {
            if (listBookAfterSortPrice.get(i).getPrice() == tempBook.getPrice()) {
                listBook.add(listBookAfterSortPrice.get(i));
            }
        }

        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    /**
     * Test lọc sách có giá cao nhất.
     */
    public static void testFilterBooksHighestPrice() {
        /* TODO */
        System.out.println("testFilterBooksHighestPrice");
        List<Book> listBookAfterSortPrice = bookManager.sortDecreasingPrice();
        Book tempBook = listBookAfterSortPrice.getFirst();

        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < listBookAfterSortPrice.size(); i++) {
            if (listBookAfterSortPrice.get(i).getPrice() == tempBook.getPrice()) {
                listBook.add(listBookAfterSortPrice.get(i));
            }
        }

        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    /**
     * Test lọc sách theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        /* TODO */
        System.out.println("testFilterBooksOfAuthor");
        String author = "Goswami Jaideva";
        List<Book> listBook = bookManager.filterBooksOfAuthor(author);

        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    /**
     * Test lọc sách theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        /* TODO */
        System.out.println("testFilterBooksOfPublisher");
        String publisher = "Wiley";
        List<Book> listBook = bookManager.filterBooksOfPublisher(publisher);

        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    /**
     * Test lọc sách theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        /* TODO */
        System.out.println("testFilterBooksOfGenre");
        String genre = "signal_processing";
        List<Book> listBook = bookManager.filterBooksOfGenre(genre);

        for (Book book : listBook) {
            System.out.println(book);
        }
    }
}
