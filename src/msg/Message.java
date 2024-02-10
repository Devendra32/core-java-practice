package msg;

import java.util.Scanner;

public class Message implements Runnable {

  public void run() {
    System.out.println();
    System.out.println();
    meth1();
    System.out.println("      *********     ******      ***********      ***********   ***     ***  ");
    meth1();
    System.out.println("    ***********    ***   ***    ************     ************   ***   ***   ");
    meth1();
    System.out.println("    ***          ***       ***  ***      ***     ***      ***    *** ***    ");
    meth1();
    System.out.println("      ***        ***       ***  ***********      ***********      *****     ");
    meth1();
    System.out.println("        ***      ***       ***  ***********      ***********       ***      ");
    meth1();
    System.out.println("          *****  ***       ***  ***      ***     ***      ***      ***      ");
    meth1();
    System.out.println("    ***********    ***   ***    ***       ***    ***       ***     ***      ");
    meth1();
    System.out.println("    *********       ******      ***        ***   ***        ***    ***      ");
    meth1();
    System.out.println();
  }

  public void meth1() {
    try {
      Thread.sleep(300);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char c;
    do {
      Runnable r = new Message();
      Thread t = new Thread(r);

      t.start();
      try {
        Thread.sleep(4000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
      System.out.println("If you forgive me !! press y otherwise press any key : ");
      c = sc.nextLine().trim().charAt(0);

    } while (c != 'y');
    System.out.println();
    System.out.println();
    System.out.println("Thank You..... I'm Happy.......!!!");
    sc.close();
  }
}
