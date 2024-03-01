package basic;

import java.time.LocalDate;

public class CurrentMonthCal {

  public static int getDays(LocalDate date) {
    if (date.isLeapYear() && date.getMonthValue() == 2) {
      return 29;
    }
    int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    return days[date.getMonthValue() - 1];
  }

  public void display_current_month(LocalDate date) {
    int dayOfWeek = date.getDayOfWeek().getValue();
    int days = getDays(date);

    System.out.println("\t" + date.getMonth().toString() + "/" + date.getYear());

    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    for (int i = 1; i <= dayOfWeek; i++) {
      System.out.printf("%4s", "");
    }
    for (int day = 1; day <= days; day++) {
      System.out.printf("%4d", day);
      dayOfWeek++;
      if (dayOfWeek % 7 == 0 || day == days) {
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    LocalDate current_date = LocalDate.now();
    CurrentMonthCal obj = new CurrentMonthCal();
    obj.display_current_month(current_date);
  }
}
