package hus.oop.generic.example;

public class FirstExample<T> {
    private T data;
    public FirstExample(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "the string of data is " + data;
    }

    public void printData() {
        System.out.println(this.toString());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student" + '[' +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Client {
    public static void main(String[] args) {
        FirstExample<Student> firstExample =
                new FirstExample<>(new Student("Nguyen Van A", 18));

        firstExample.printData();
    }
}
