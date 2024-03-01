package basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class JVMArch {
  public static void main(String[] args) {

    Student s1= new Student();
    Class<? extends Student> c1 = s1.getClass();

    Field[] declaredFields = c1.getDeclaredFields();
    Method[] declaredMethods = c1.getDeclaredMethods();

    Stream.of(declaredFields).forEach(System.out::println);
    System.out.println("----------------------------");
    Stream.of(declaredMethods).forEach(System.out::println);

  }
}

class Student {

  private int studentId;
  private String studentName;

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

}
