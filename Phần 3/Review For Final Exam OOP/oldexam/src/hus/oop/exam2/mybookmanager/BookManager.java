package hus.oop.exam2.mybookmanager;

public class BookManager {
    // Singleton pattern
    private static BookManager instance;

    private MyList bookList;

    private BookManager() {
        bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new BookManager();
        }

        return instance;
    }

    public MyList getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        bookList.append(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        bookList.insert(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return (Book) bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự số trang tăng dần.
     * @return
     */
    public MyList sortPagesIncreasing() {
        /* TODO */
        MyList listBook = new MyArrayList();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (((Book) listBook.get(i)).getPages()
                        > ((Book) listBook.get(j)).getPages()) {
                    Book temp = (Book) listBook.get(i);
                    listBook.set(listBook.get(j), i);
                    listBook.set(temp, j);
                }
            }
        }

        return listBook;
    }

    /**
     * Sắp xếp book theo thứ tự số trang giảm dần.
     * @return
     */
    public MyList sortPagesDecreasing() {
        /* TODO */
        MyList listBook = new MyArrayList();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (((Book) listBook.get(i)).getPages()
                        < ((Book) listBook.get(j)).getPages()) {
                    Book temp = (Book) listBook.get(i);
                    listBook.set(listBook.get(j), i);
                    listBook.set(temp, j);
                }
            }
        }

        return listBook;
    }

    /**
     * Sắp xếp sách theo thứ tự giá tăng dần.
     * @return
     */
    public MyList sortPriceIncreasing() {
        /* TODO */
        MyList listBook = new MyArrayList();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (((Book) listBook.get(i)).getPrice()
                        > ((Book) listBook.get(j)).getPrice()) {
                    Book temp = (Book) listBook.get(i);
                    listBook.set(listBook.get(j), i);
                    listBook.set(temp, j);
                }
            }
        }

        return listBook;
    }

    /**
     * Sắp xếp sách theo thứ tự giá giảm dần.
     * @return
     */
    public MyList sortPriceDecreasing() {
        /* TODO */
        MyList listBook = new MyArrayList();
        listBook.addAll(bookList);

        for (int i = 0; i < listBook.size() - 1; i++) {
            for (int j = i + 1; j < listBook.size(); j++) {
                if (((Book) listBook.get(i)).getPrice()
                        < ((Book) listBook.get(j)).getPrice()) {
                    Book temp = (Book) listBook.get(i);
                    listBook.set(listBook.get(j), i);
                    listBook.set(temp, j);
                }
            }
        }

        return listBook;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        /* TODO */
        MyList listBook = new MyArrayList();

        for (int i = 0; i < getBookList().size(); i++) {
            if (((Book) bookList.get(i)).getPublisher().equals(publisher)) {
                listBook.append(bookList.get(i));
            }
        }

        return listBook;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        /* TODO */
        MyList listBook = new MyArrayList();

        for (int i = 0; i < getBookList().size(); i++) {
            if (((Book) bookList.get(i)).getGenre().equals(genre)) {
                listBook.append(bookList.get(i));
            }
        }

        return listBook;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        /* TODO */
        MyList listBook = new MyArrayList();

        for (int i = 0; i < getBookList().size(); i++) {
            if (((Book) bookList.get(i)).getAuthor().equals(author)) {
                listBook.append(bookList.get(i));
            }
        }

        return listBook;
    }

    public static String titleOfBooksToString(MyList bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        MyIterator it = bookList.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(MyList bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        MyIterator it = bookList.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
        System.out.println();
    }
}
