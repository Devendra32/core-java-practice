package demo;

public class ClassB {
      public static void main(String[] args) {
        ClassB bobj=new ClassB();
        System.out.println(bobj);
        System.out.println(bobj.hashCode());
        ClassB bobj1=new ClassB();
        //ClassB bobj1 = bobj;
        System.out.println(bobj1);
        System.out.println(bobj1.hashCode());
        System.out.println(bobj.equals(bobj1));
        System.out.println(bobj==bobj1);
        
        byte a = (byte) 128;
        System.out.println(a);
      }
}
