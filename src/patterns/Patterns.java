package patterns;

public class Patterns {

  public void pattern1(int totalRow) {
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    for (int row = 1; row <= totalRow; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public void pattern2(int totalRow) {  
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * * 
    for (int row = 1; row <= totalRow; row++) {
      for (int space = 1; space <= totalRow - row; space++) {
        System.out.print(" ");
      }
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Patterns pobj = new Patterns();
    pobj.pattern2(5);
  }

}
