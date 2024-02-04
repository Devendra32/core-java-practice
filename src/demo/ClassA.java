package demo;

public class ClassA
{
    void m1()
    {
        String s1="Dev";
        String s2="Dev";

        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("-------------------------------------------");
        s1="Ram";
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println("Ram".hashCode());
    }
    void m2()
    {
        //String s1="ram";
        String s2=new String("ram");
        String s3=new String("ram");


        //System.out.println(s1==s2);
        System.out.println(s2==s3);
        //System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("____________________________________");
        //s1="Dev";
        //System.out.println(s1.hashCode());
        System.out.println("ram".hashCode());

    }
    public static void main(String[] args)
    {
        ClassA aObj = new ClassA();
//        aObj.m1();
        aObj.m2();
    }
}
