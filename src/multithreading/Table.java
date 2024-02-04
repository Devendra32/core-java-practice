package multithreading;

public class Table {
     synchronized void printTable(int n) {
        System.out.println("Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
