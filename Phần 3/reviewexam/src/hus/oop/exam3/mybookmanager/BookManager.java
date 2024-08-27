package hus.oop.exam3.mybookmanager;

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
        this.bookList.append(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        this.bookList.insert(book, index);
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
        return (Book) this.bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự số trang tăng dần.
     * @return
     */
    public MyList sortPagesIncreasing() {
        /* TODO */
        MyList listBooks = new MyArrayList();
        listBooks.addAll(bookList);

        for (int i = 0; i < listBooks.size() - 1; i++) {
            for (int j = i + 1; j < listBooks.size(); j++) {
                if (((Book) listBooks.get(i)).getPages()
                        > ((Book) listBooks.get(j)).getPages()) {
                    Book temp = ((Book) listBooks.get(i));
                    listBooks.set((listBooks.get(j)), i);
                    listBooks.set(temp, j);
                }
            }
        }

        return listBooks;
    }

    /**
     * Sắp xếp book theo thứ tự số trang giảm dần.
     * @return
     */
    public MyList sortPagesDecreasing() {
        /* TODO */
        MyList listBooks = new MyArrayList();
        listBooks.addAll(bookList);

        for (int i = 0; i < listBooks.size() - 1; i++) {
            for (int j = i + 1; j < listBooks.size(); j++) {
                if (((Book) listBooks.get(i)).getPages()
                        < ((Book) listBooks.get(j)).getPages()) {
                    Book temp = ((Book) listBooks.get(i));
                    listBooks.set((listBooks.get(j)), i);
                    listBooks.set(temp, j);
                }
            }
        }

        return listBooks;
    }

    /**
     * Sắp xếp sách theo thứ tự giá tăng dần.
     * @return
     */
    public MyList sortPriceIncreasing() {
        /* TODO */
        MyList listBooks = new MyArrayList();
        listBooks.addAll(bookList);

        for (int i = 0; i < listBooks.size() - 1; i++) {
            for (int j = i + 1; j < listBooks.size(); j++) {
                if (((Book) listBooks.get(i)).getPrice()
                        > ((Book) listBooks.get(j)).getPrice()) {
                    Book temp = ((Book) listBooks.get(i));
                    listBooks.set((listBooks.get(j)), i);
                    listBooks.set(temp, j);
                }
            }
        }

        return listBooks;
    }

    /**
     * Sắp xếp sách theo thứ tự giá giảm dần.
     * @return
     */
    public MyList sortPriceDecreasing() {
        /* TODO */
        MyList listBooks = new MyArrayList();
        listBooks.addAll(bookList);

        for (int i = 0; i < listBooks.size() - 1; i++) {
            for (int j = i + 1; j < listBooks.size(); j++) {
                if (((Book) listBooks.get(i)).getPrice()
                        < ((Book) listBooks.get(j)).getPrice()) {
                    Book temp = ((Book) listBooks.get(i));
                    listBooks.set((listBooks.get(j)), i);
                    listBooks.set(temp, j);
                }
            }
        }

        return listBooks;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        /* TODO */
        MyList listBooks = new MyArrayList();

        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getPublisher().equals(publisher)) {
                listBooks.append(bookList.get(i));
            }
        }

        return listBooks;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        /* TODO */
        MyList listBooks = new MyArrayList();

        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getGenre().equals(genre)) {
                listBooks.append(bookList.get(i));
            }
        }

        return listBooks;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        /* TODO */
        MyList listBooks = new MyArrayList();

        for (int i = 0; i < bookList.size(); i++) {
            if (((Book) bookList.get(i)).getAuthor().equals(author)) {
                listBooks.append(bookList.get(i));
            }
        }

        return listBooks;
    }

    public static String titleOfBooksToString(MyList bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        MyIterator it = bookList.iterator();
        while (it.hasNext()) {
            titleOfBooks.append(((Book) it.next()).getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(MyList bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        MyIterator it = bookList.iterator();
        while (it.hasNext()) {
            booksString.append(it.next().toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
        System.out.println();
    }
}
