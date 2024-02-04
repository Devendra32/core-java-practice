package blocks;

/*
 * 1. static blocks
 * 2. main method
 * 3. instance blocks (called when object created)
 * 4. constructor (called when object created)
 * */

public class ClassA{

    public ClassA(){
      System.out.println("Constructor....");
    }
    
    {
        System.out.println("first instance block....");
    }
    static{
      System.out.println("inside static block");
    }

    public static void main(String[] args) {
      System.out.println("main method...");
      new ClassA();
    }
    {
      System.out.println("second instance block");
    }
}
