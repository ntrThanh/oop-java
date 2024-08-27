package hus.oop.lab9.phonebook;

public interface PhoneBook {
    void addPerson(Student p);
    Student searchByName(String name);
    Student searchByLastName(String lastName);
    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
