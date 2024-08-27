package hus.oop.design_patterns.lab11.visitor.book;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new JavaCoreBook());
        books.add(new BusinessBook());
        books.add(new DesignPatternBook());
        books.add(new JavaCoreBook());


        Visitor visitor = new VisitorImpl();

        for (int i = 0; i < books.size(); i++) {
            books.get(i).accept(visitor);
        }
    }
}
