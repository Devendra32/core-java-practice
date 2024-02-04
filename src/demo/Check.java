package demo;

public class Check {
  public int a;
  public static int c;
  void meth1(){
    System.out.println(a);
  }
  public static void main(String[] args) {
    //Check ck = new Check();
    //Check ck1 = new Check();

    //Check ck2 = ck;

    //System.out.println("ck = ck1 : "+ck.equals(ck1));
    //System.out.println("ck = ck2 : "+ck.equals(ck2));


    //byte a = 100;
    //byte b = 30;

    //byte c =(byte)(a+b);
    //System.out.println(c);

    //int x = 5;

    //x = ++x + ++x;
    //System.out.println(x);

    int a = 10, b=20;
    System.out.println("before swaping "+a + " "+b);
    a= a+b;
    b=a-b;
    a=a-b;

    System.out.println("after swaping "+a +" "+b);

  }
}
