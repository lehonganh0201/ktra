package Ktra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements StudentService, Comparator<Student> {
    List<Student> students;

    public StudentServiceImpl() {
        students=new ArrayList<>();
    }

    @Override
    public void addStudent(Student t) {
        students.add(t);
    }

    @Override
    public void deleteStudent(int id) {
        for(Student student:students){
            if(student.getId()==id){
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public Student searchStudent(String name) {
        for(Student student:students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void sortedStudent() {
        Collections.sort(students,this);
    }

    @Override
    public void showAllStudent() {
        for(Student student:students){
            System.out.println(student);
        }
        System.out.println();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getScore()-o1.getScore());
    }
}
