package basic;

public class Test {
  public static void main(String[] args) {
    int amount = 12000;

    if(amount >= 10000){
      amount = amount - (amount*25)/100;
    }
    System.out.println("amount is : "+ amount);

  }
}
