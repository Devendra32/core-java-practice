package basic;

public class ClassA {
  int a = 10;
  int b = 20;

  public static void main(String[] args) {
    ClassA aobj = new ClassA();
    
    ClassA bobj = new ClassA();
    ClassA cobj = aobj;
    cobj.a = 50;
    cobj.b = 60;

    System.out.println("equals method : " + aobj.equals(bobj));
    System.out.println(" == Operater  : " + (aobj == bobj));
    System.out.println("equals        : " + aobj.equals(cobj));
    System.out.println(" ==           : " + (aobj == cobj));
    System.out.println("iii==           : " + (cobj instanceof ClassA));


    System.out.println(aobj.a + " " + aobj.b);
    System.out.println(cobj.a + " " + cobj.b);
    
  }
}
