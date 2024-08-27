package hus.oop.exam3.bookmanager;

import java.util.*;

public class BookManager {
    // Singleton pattern
    private static BookManager instance;

    private List<Book> bookList;

    private BookManager() {
        bookList = new LinkedList<>();
    }

    public static BookManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BookManager();
        }

        return instance;
    }

    public List<Book> getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        this.bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        this.bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        this.bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        this.bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return this.bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự số trang tăng dần.
     * @return
     */
    public List<Book> sortPagesIncreasing() {
        List<Book> listBookResult = new ArrayList<>();
        listBookResult.addAll(bookList);

        for (int i = 0; i < listBookResult.size() - 1; i++) {
            for (int j = i + 1; j < listBookResult.size(); j++) {
                if (listBookResult.get(i).getPages() > listBookResult.get(j).getPages()) {
                    Book temp = listBookResult.get(i);
                    listBookResult.set(i, listBookResult.get(j));
                    listBookResult.set(j, temp);
                }
            }
        }

        return listBookResult;
    }

    /**
     * Sắp xếp book theo thứ tự số trang giảm dần.
     * @return
     */
    public List<Book> sortPagesDecreasing() {
        /* TODO */
        List<Book> listBookResult = new ArrayList<>();
        listBookResult.addAll(bookList);

        for (int i = 0; i < listBookResult.size() - 1; i++) {
            for (int j = i + 1; j < listBookResult.size(); j++) {
                if (listBookResult.get(i).getPages() < listBookResult.get(j).getPages()) {
                    Book temp = listBookResult.get(i);
                    listBookResult.set(i, listBookResult.get(j));
                    listBookResult.set(j, temp);
                }
            }
        }

        return listBookResult;
    }

    /**
     * Sắp xếp sách theo thứ tự giá tăng dần.
     * @return
     */
    public List<Book> sortPriceIncreasing() {
        List<Book> listBookResult = new ArrayList<>();
        listBookResult.addAll(bookList);

        for (int i = 0; i < listBookResult.size() - 1; i++) {
            for (int j = i + 1; j < listBookResult.size(); j++) {
                if (listBookResult.get(i).getPrice() > listBookResult.get(j).getPrice()) {
                    Book temp = listBookResult.get(i);
                    listBookResult.set(i, listBookResult.get(j));
                    listBookResult.set(j, temp);
                }
            }
        }

        return listBookResult;
    }

    /**
     * Sắp xếp sách theo thứ tự giá giảm dần.
     * @return
     */
    public List<Book> sortPriceDecreasing() {
        /* TODO */
        List<Book> listBookResult = new ArrayList<>();
        listBookResult.addAll(bookList);

        for (int i = 0; i < listBookResult.size() - 1; i++) {
            for (int j = i + 1; j < listBookResult.size(); j++) {
                if (listBookResult.get(i).getPrice() < listBookResult.get(j).getPrice()) {
                    Book temp = listBookResult.get(i);
                    listBookResult.set(i, listBookResult.get(j));
                    listBookResult.set(j, temp);
                }
            }
        }

        return listBookResult;
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        List<Book> listBookResult = sortPagesDecreasing();
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < listBookResult.size(); i++) {
            filterBooks.add(listBookResult.get(i));
        }

        return filterBooks;
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() > lowerBound) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> listBookResult = sortPagesIncreasing();
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < listBookResult.size(); i++) {
            filterBooks.add(listBookResult.get(i));
        }

        return filterBooks;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() < upperBound) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
    }

    /**
     * Lọc ra howMany sách có giá cao nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBooksHighestPrice(int howMany) {
        /* TODO */
        List<Book> listBookResult = sortPriceDecreasing();
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < listBookResult.size(); i++) {
            filterBooks.add(listBookResult.get(i));
        }

        return filterBooks;
    }

    /**
     * Lọc ra howMany sách có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(int lowerBound) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPrice() > lowerBound) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
    }

    /**
     * Lọc ra howMany sách có giá thấp nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBooksLowestPrice(int howMany) {
        /* TODO */
        List<Book> listBookResult = sortPriceIncreasing();
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < listBookResult.size(); i++) {
            filterBooks.add(listBookResult.get(i));
        }

        return filterBooks;
    }

    /**
     * Lọc ra howMany sách có giá thấp hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPriceLowerThan(double upperBound) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPrice() < upperBound) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPublisher().equals(publisher)) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getGenre().equals(genre)) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> filterBooks = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                filterBooks.add(bookList.get(i));
            }
        }

        return filterBooks;
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
        System.out.println();
    }
}
