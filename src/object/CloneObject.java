package object;

class Student implements Cloneable
{

  int id =1;
  String name = "John";
  double fee = 1000.0;

  public Object clone() throws CloneNotSupportedException
  {
    Object o = super.clone();
    return o;
  }
}

public class CloneObject 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
      Student s1 = new Student();
      System.out.println(s1.id+" "+s1.name+" "+s1.fee);

      Student s2 =(Student) s1.clone();
      System.out.println(s2.id+" "+s2.name+" "+s2.fee);

      System.out.println("s1 == s2 " + (s1 == s2));
    }  
}
