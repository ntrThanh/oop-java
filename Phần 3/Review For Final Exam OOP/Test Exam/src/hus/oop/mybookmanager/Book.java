package hus.oop.mybookmanager;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;
    private String publisher;

    private Book() {}

    public static class BookBuilder {
        private String title;
        private String author;
        private String genre;
        private int pages;
        private double price;
        private String publisher;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder withAuthor(String author) {
            /* TODO */
            this.author = author;
            return this;
        }

        public BookBuilder withGenre(String genre) {
            /* TODO */
            this.genre = genre;
            return this;
        }

        public BookBuilder withPages(int pages) {
            /* TODO */
            this.pages = pages;
            return this;
        }

        public BookBuilder withPrice(double price) {
            /* TODO */
            this.price = price;
            return this;
        }

        public BookBuilder withPublisher(String publisher) {
            /* TODO */
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.title = this.title;
            book.author = this.author;
            book.genre = this.genre;
            book.pages = this.pages;
            book.price = this.price;
            book.publisher = this.publisher;
            return book;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book" + '[' +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ']';
    }
}
