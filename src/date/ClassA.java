package date;

import java.time.LocalDate;
import java.time.Month;

public class ClassA
{
    public void date()
    {
        LocalDate todayDate = LocalDate.now();
        Month month = todayDate.getMonth();
        System.out.println("month :"+month);

        System.out.println("Current Date :"+todayDate);
    }
    public char meth2(String s)
    {
        char c = (char)(s.charAt(0) + 1);
        return c;
    }
    public static void main(String[] args)
    {
//        new ClassA().date();
        System.out.println("=====> "+new ClassA().meth2("S"));
    }
}