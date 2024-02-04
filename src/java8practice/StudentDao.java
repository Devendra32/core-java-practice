package java8practice;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(100l,"Devendra", "MCA"));
        studentList.add(new Student(101l,"Mohit", "BCA"));
        studentList.add(new Student(102l,"Amit", "MCA"));
        studentList.add(new Student(103l,"Rohan", "MSC"));
        return studentList;
    }
}
