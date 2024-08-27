package hus.oop.lab4.book1;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBoook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBoook);

        dummyBoook.setPrice(29.95);
        dummyBoook.setQty(28);
        System.out.println("name is: " + dummyBoook.getName());
        System.out.println("price is: " + dummyBoook.getPrice());
        System.out.println("qty is: " + dummyBoook.getQty());
        System.out.println("Author is: " + dummyBoook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBoook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
                                    new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
