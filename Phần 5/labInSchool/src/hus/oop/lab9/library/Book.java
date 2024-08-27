package hus.oop.lab9.library;

public class Book extends Item {
    private int page;

    public Book(String title, int year, int page) {
        super(title, year);
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book" + '[' +
                "page=" + page +
                ", title='" + super.getTitle() + '\'' +
                ", year=" + super.getYear() +
                ']';
    }
}
