package Ktra;

import java.util.List;

public interface StudentService {
    void addStudent(Student t);
    void deleteStudent(int id);
    Student searchStudent(String name);
    void sortedStudent();
    void showAllStudent();
}
