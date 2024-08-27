package hus.oop.lab9.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap implements PhoneBook {
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        this.phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByName(String name) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastName) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getLastName().equals(lastName)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getPhone().equals(phone)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getPhone().equals(phone)) {
                phoneBook.remove(phone);
                return;
            }
        }
    }
}
