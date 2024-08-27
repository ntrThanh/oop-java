package hus.oop.mybookmanager;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        /* TODO */
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
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        /* TODO */
        this.bookList.insertAtStart(book);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        /* TODO */
        this.bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        /* TODO */
        this.bookList.insertAtPosition(book, index);
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
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return (Book) bookList.get(index);
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        double price = 0;

        for (int i = 0; i < bookList.size(); i++) {
            if (price < ((Book) bookList.get(i)).getPrice()) {
                price = ((Book) bookList.get(i)).getPrice();
            }
        }

        for (int i = 0; i < bookList.size(); i++) {
            if (price == ((Book) bookList.get(i)).getPrice()) {
                return (Book) bookList.get(i);
            }
        }

        return null;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        double price = Double.MAX_VALUE;

        for (int i = 0; i < bookList.size(); i++) {
            if (price > ((Book) bookList.get(i)).getPrice()) {
                price = ((Book) bookList.get(i)).getPrice();
            }
        }

        for (int i = 0; i < bookList.size(); i++) {
            if (price == ((Book) bookList.get(i)).getPrice()) {
                return (Book) bookList.get(i);
            }
        }

        return null;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        int page = 0;

        for (int i = 0; i < bookList.size(); i++) {
            if (page < ((Book) bookList.get(i)).getPages()) {
                page = ((Book) bookList.get(i)).getPages();
            }
        }

        for (int i = 0; i < bookList.size(); i++) {
            if (page == ((Book) bookList.get(i)).getPages()) {
                return (Book) bookList.get(i);
            }
        }

        return null;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        int page = Integer.MAX_VALUE;

        for (int i = 0; i < bookList.size(); i++) {
            if (page > ((Book) bookList.get(i)).getPages()) {
                page = ((Book) bookList.get(i)).getPages();
            }
        }

        for (int i = 0; i < bookList.size(); i++) {
            if (page == ((Book) bookList.get(i)).getPages()) {
                return (Book) bookList.get(i);
            }
        }

        return null;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        /* TODO */
        MyList filterBook = new MyLinkedList();

        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getPublisher().equals(publisher)) {
                filterBook.insertAtEnd(bookList.get(i));
            }
        }

        return filterBook;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        /* TODO */
        MyList filterBook = new MyLinkedList();

        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getGenre().equals(genre)) {
                filterBook.insertAtEnd(bookList.get(i));
            }
        }

        return filterBook;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        /* TODO */
        MyList filterBook = new MyLinkedList();

        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getAuthor().equals(author)) {
                filterBook.insertAtEnd(bookList.get(i));
            }
        }

        return filterBook;
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
