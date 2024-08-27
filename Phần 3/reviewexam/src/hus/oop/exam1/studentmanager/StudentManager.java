package hus.oop.exam1.studentmanager;

import java.util.*;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        studentList = new LinkedList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }

        return instance;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.add(index, student);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự năm sinh tăng dần.
     * @return
     */
    public List<Student> sortYearOfBirthIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return left.getYearOfBirth() - right.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp sinh viên theo thứ tự năm sinh giảm dần.
     * @return
     */
    public List<Student> sortYearOfBirthDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                return right.getYearOfBirth() - left.getYearOfBirth();
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (left.getMathsGrade() > right.getMathsGrade()) {
                    return 1;
                } else if (left.getMathsGrade() < right.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        List<Student> newList = new LinkedList<>(this.studentList);
        Collections.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student left, Student right) {
                if (right.getMathsGrade() > left.getMathsGrade()) {
                    return 1;
                } else if (right.getMathsGrade() < left.getMathsGrade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        /* TODO */
        List<Student> listStudent = new ArrayList<>(studentList);

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(i).getPhysicsGrade() >
                        listStudent.get(j).getPhysicsGrade()) {
                    Student temp = listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, temp);
                }
            }
        }

        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        /* TODO */
        List<Student> listStudent = new ArrayList<>(studentList);

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(i).getPhysicsGrade() <
                        listStudent.get(j).getPhysicsGrade()) {
                    Student temp = listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, temp);
                }
            }
        }

        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        /* TODO */
        List<Student> listStudent = new ArrayList<>(studentList);

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(i).getChemistryGrade() >
                        listStudent.get(j).getChemistryGrade()) {
                    Student temp = listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, temp);
                }
            }
        }

        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        /* TODO */
        List<Student> listStudent = new ArrayList<>(studentList);

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(i).getChemistryGrade() <
                        listStudent.get(j).getChemistryGrade()) {
                    Student temp = listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, temp);
                }
            }
        }

        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        List<Student> listStudent = new ArrayList<>(studentList);

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(i).getAverageGrade() >
                        listStudent.get(j).getAverageGrade()) {
                    Student temp = listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, temp);
                }
            }
        }

        return listStudent;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        List<Student> listStudent = new ArrayList<>(studentList);

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                if (listStudent.get(i).getAverageGrade() <
                        listStudent.get(j).getAverageGrade()) {
                    Student temp = listStudent.get(i);
                    listStudent.set(i, listStudent.get(j));
                    listStudent.set(j, temp);
                }
            }
        }

        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortPhysicsGradeDecreasing().get(i));
        }

        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm lý thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestPhysicsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortPhysicsGradeIncreasing().get(i));
        }

        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestMathsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortMathsGradeDecreasing().get(i));
        }

        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm toán thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestMathsGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortMathsGradeIncreasing().get(i));
        }

        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortChemistryGradeDecreasing().get(i));
        }

        return listStudent;
    }

    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortAverageGradeDecreasing().get(i));
        }

        return listStudent;
    }

    /**
     * Lọc ra howMany sinh viên có điểm hóa thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestChemistryGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortChemistryGradeIncreasing().get(i));
        }

        return listStudent;
    }

    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        List<Student> listStudent = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            listStudent.add(sortAverageGradeIncreasing().get(i));
        }

        return listStudent;
    }

    public static String idOfStudentsToString(List<Student> countryList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : countryList) {
            idOfStudents.append(country.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
