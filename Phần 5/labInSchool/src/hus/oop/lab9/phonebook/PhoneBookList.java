package hus.oop.lab9.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student std : phoneBook) {
            if (std.getName().equals(name)) {
                return std;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (Student std : phoneBook) {
            if (std.getLastName().equals(lastName)) {
                return std;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student std : phoneBook) {
            if (std.getPhone().equals(phone)) {
                return std;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Student std : phoneBook) {
            if (std.getPhone().equals(phone)) {
                phoneBook.remove(std);
            }
        }
    }
}
