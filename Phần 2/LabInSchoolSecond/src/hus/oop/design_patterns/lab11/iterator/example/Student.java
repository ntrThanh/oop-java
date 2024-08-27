package hus.oop.design_patterns.lab11.iterator.example;

public class Student {
    private String name;
    private String date;
    private double gpa;

    public Student(String name, String date, double gpa) {
        this.name = name;
        this.date = date;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student" + '[' +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gpa=" + gpa +
                ']';
    }
}
