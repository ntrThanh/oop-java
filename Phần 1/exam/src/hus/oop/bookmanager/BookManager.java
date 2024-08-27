package hus.oop.bookmanager;

import java.util.*;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     *
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if (index < 0 || index > limit) {
            return false;
        }

        return true;
    }

    /**
     * Thêm book vào cuối danh sách.
     *
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     *
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     *
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     *
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     *
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     *
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        return listBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     *
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        return listBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     *
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        return listBook;
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     *
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (listBook.get(i).getPrice() > listBook.get(j).getPrice()) {
                    Book temp = listBook.get(i);
                    listBook.set(i, listBook.get(j));
                    listBook.set(j, temp);
                }
            }
        }

        return listBook;
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     *
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (listBook.get(i).getPrice() < listBook.get(j).getPrice()) {
                    Book temp = listBook.get(i);
                    listBook.set(i, listBook.get(j));
                    listBook.set(j, temp);
                }
            }
        }

        return listBook;
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     *
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (listBook.get(i).getPages() > listBook.get(j).getPages()) {
                    Book temp = listBook.get(i);
                    listBook.set(i, listBook.get(j));
                    listBook.set(j, temp);
                }
            }
        }

        return listBook;
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     *
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        List<Book> listBook = new ArrayList<>();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (listBook.get(i).getPages() < listBook.get(j).getPages()) {
                    Book temp = listBook.get(i);
                    listBook.set(i, listBook.get(j));
                    listBook.set(j, temp);
                }
            }
        }

        return listBook;
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     *
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        List<Book> listBook = sortDecreasingPages();
        List<Book> listHighestPages = new ArrayList<>();

        for (int i = 0; i < howMany; i++) {
            listHighestPages.add(listBook.get(i));
        }

        return listHighestPages;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     *
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() > (int) lowerBound) {
                listBook.add(bookList.get(i));
            }
        }

        return listBook;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     *
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> listBook = sortIncreasingPages();
        List<Book> listLowestPages = new ArrayList<>();

        for (int i = 0; i < howMany; i++) {
            listLowestPages.add(listBook.get(i));
        }
        return listLowestPages;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     *
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() < (int) upperBound) {
                listBook.add(bookList.get(i));
            }
        }

        return listBook;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     *
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPublisher().equals(publisher)) {
                listBook.add(bookList.get(i));
            }
        }

        return listBook;
    }

    /**
     * Lọc ra những sách theo thể loại.
     *
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getGenre().equals(genre)) {
                listBook.add(bookList.get(i));
            }
        }

        return listBook;
    }

    /**
     * Lọc ra những sách theo tác giả.
     *
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> listBook = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                listBook.add(bookList.get(i));
            }
        }

        return listBook;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
