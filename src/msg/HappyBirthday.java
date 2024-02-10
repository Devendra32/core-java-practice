package msg;

public class HappyBirthday implements Runnable {
  public static void sleepMeth(){
    try{
      Thread.sleep(500);
    }catch(Exception e){

    }
  }
  public static void sleepMeth1(){
    try{
      Thread.sleep(1000);
    }catch(Exception e){
      
    }
  }

  public void run(){
    System.out.println();

    System.out.println("    ***        ***         ******          ***********    ***********   ***     ***  ");
    sleepMeth();
    System.out.println("    ***        ***        ********         ************   ************   ***   ***   ");
    sleepMeth();
    System.out.println("    ***        ***       ***    ***        ***       ***  ***       ***   *** ***    ");
    sleepMeth();
    System.out.println("    **************      ************       *************  *************    *****     ");
    sleepMeth();
    System.out.println("    **************     **************      **********     **********        ***      ");
    sleepMeth();
    System.out.println("    ***        ***    ***          ***     ***            ***               ***      ");
    sleepMeth();
    System.out.println("    ***        ***   ***            ***    ***            ***               ***      ");
    sleepMeth();
    System.out.println("    ***        ***  ***              ***   ***            ***               ***      ");
    sleepMeth();    
    sleepMeth1();

    System.out.println();
    System.out.println();
    System.out.println();
    
    System.out.println("    *****   **  *******  *********** **     **  ********        ***      **    **    ");
    sleepMeth();
    System.out.println("    **  **  **  **    **     **      **     **  **     **      ** **      **  **     ");
    sleepMeth();
    System.out.println("    *****   **  ******       **      *********  **      **    *******      ****      ");
    sleepMeth();
    System.out.println("    **  **  **  **   **      **      **     **  **     **    **     **      **       ");
    sleepMeth();
    System.out.println("    *****   **  **    **     **      **     **  ********    **       **     **       ");
    sleepMeth();
    sleepMeth1();

    
    System.out.println();
    System.out.println();
    System.out.println();


    System.out.println("              *****   **   ****    **   ********    **     **  **    **   ");
    sleepMeth();
    System.out.println("             **       **   ** **   **   **     **   **     **  **    **   ");
    sleepMeth();
    System.out.println("               **     **   **  **  **   **      **  *********  **    **   ");
    sleepMeth();
    System.out.println("                 **   **   **   ** **   **     **   **     **  **    **   ");
    sleepMeth();
    System.out.println("             *****    **   **    ****   ********    **     **    ****     ");
    sleepMeth();
    
    sleepMeth1();

    System.out.println("             \n\n\n                        ------Dev Rajput--------                  ");

  }
  public static void main(String[] args) {

    Runnable r = new HappyBirthday();

    Thread t = new Thread(r);

    t.start();


  }
}
