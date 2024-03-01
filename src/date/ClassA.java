package date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class ClassA
{
    public void date()
    {
        LocalDate todayDate = LocalDate.now();
        Month month = todayDate.getMonth();
        System.out.println("month :"+month);

        System.out.println("Current Date :"+todayDate);

        System.out.println("clock"+LocalDate.now(ZoneId.of("ACT")));
    }
    public static void main(String[] args)
    {
        new ClassA().date();
        
    }
}