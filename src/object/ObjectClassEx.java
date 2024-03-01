package object;
import java.util.Arrays;

class Employee{
  private Integer eid = 10;
  private String empName = "John";
  private Double salary = 1000.00;

  public void working(){
    System.out.println("Employee working...");
    System.out.println(this.eid);
    System.out.println(this.empName);
    System.out.println(this.salary);
  } 
}


public class ObjectClassEx{
  public static void main(String [] args){
    Employee emp = new Employee();

     Class<? extends Employee> class1 = emp.getClass();
     System.out.println(class1.getName());
      emp.working();
      System.out.println(Arrays.asList(class1.getDeclaredMethods()));
    
  }
}