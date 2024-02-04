package math;

import java.math.BigInteger;
import java.util.Scanner;

public class MathClassExamples {

    public void m1(){
        Scanner sc = new Scanner(System.in);
        BigInteger a= new BigInteger(sc.next());
        BigInteger b=new BigInteger(sc.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        sc.close();
    }


    public static void main(String[] args) {
        new MathClassExamples().m1();
    }
}
