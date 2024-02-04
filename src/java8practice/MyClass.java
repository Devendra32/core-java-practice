package java8practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass {

   public List<Student> getStudents() {
       List<Student> students = new StudentDao().getStudents();
       Collections.sort(students, (o1, o2) -> o1.getStName().compareTo(o2.getStName()));
       return students;
   }

    public static void main(String[] args) {
       System.out.println(new MyClass().getStudents());
       new MyClass().getStudents().forEach(student -> System.out.println(student));

       int[] arr = {23,12,54,34,87,56,43,98};

       List<int[]> arrList = Arrays.asList(arr);

       arrList.forEach(num -> System.out.println(num));

        String s1 = "my name is devendra";

        MyInterf interf = s -> s.length();

        System.out.println("The length of string is "+interf.m1(s1));



    }
}
