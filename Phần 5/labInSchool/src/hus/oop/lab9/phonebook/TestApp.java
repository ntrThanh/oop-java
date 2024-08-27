package hus.oop.lab9.phonebook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();

        pb.addPerson(new Student("Ni cola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45525"));
        pb.addPerson(new Student("Luisa", "Poppi", "23456"));

        System.out.println(pb.searchByName("Marco"));

        System.out.println(pb.searchByNumber("1111"));

        pb.deleteByNumber("45525");
        System.out.println(pb.searchByName("Marco"));
    }
}
