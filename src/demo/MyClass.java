package demo;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((int) (Math.pow(2, i)));
            System.out.print((i != n - 1) ? ", " : "");
        }
        sc.close();
    }
}