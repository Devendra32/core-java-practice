package basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Started !!");

        System.out.println("Hello World");
        int outerCount = 0;
        int innerCount = 0;
        int limit = 25;
        int sum = 60;
        int jv = 0;
        int j;        double randomValue = 2.77;

        for (int var = 1; var < limit; var = var + 3) {
            outerCount++;
            System.out.println("randomValue: " + randomValue);
            for (j = 1; j < limit; j = j + 2) {
                innerCount++;
                sum++;
            }
            System.out.println("Sum = " + sum);
        }
        System.out.println("Sum :"+ (sum-60)+" OuterCount : "+outerCount+ " innerCount:"+ innerCount+" "+jv);
    }


}