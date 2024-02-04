public class HappyBirthday implements Runnable {

    public void run() {
    System.out.println("***        ***         ******          ***********    ***********   ***     ***  ");
    System.out.println("***        ***        ********         ************   ************   ***   ***   ");
    System.out.println("***        ***       ***    ***        ***       ***  ***       ***   *** ***    ");
    System.out.println("**************      ************       *************  *************    *****     ");
    System.out.println("**************     **************      ************   ************      ***      ");
    System.out.println("***        ***    ***          ***     ***            ***               ***      ");
    System.out.println("***        ***   ***            ***    ***            ***               ***      ");
    System.out.println("***        ***  ***              ***   ***            ***               ***      ");

    System.out.println("*****    **  *******  *********** **     **  ********        ***      **    ** ");
    System.out.println("**  **   **  **    **     **      **     **  **     **      ** **      **  **  ");
    System.out.println("*****    **  ******       **      *********  **      **    *******      ****   ");
    System.out.println("**  **   **  **   **      **      **     **  **     **    **     **      **    ");
    System.out.println("*****    **  **    **     **      **     **  ********    **       **     **    ");

    System.out.println("           *****   **   ****    **   ********    **     **  **    **   ");
    System.out.println("          **       **   ** **   **   **     **   **     **  **    **   ");
    System.out.println("            **     **   **  **  **   **      **  *********  **    **   ");
    System.out.println("              **   **   **   ** **   **     **   **     **  **    **   ");
    System.out.println("          *****    **   **    ****   ********    **     **    ****     ");

  }

  public static void main(String[] args) {
    Runnable r = new HappyBirthday();
    Thread t = new Thread(r);
    t.start();
  }
}
