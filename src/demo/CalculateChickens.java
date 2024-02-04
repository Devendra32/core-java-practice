package demo;

import java.util.Scanner;

public class CalculateChickens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("heads");
        int heads = sc.nextInt();
        System.out.println("legs");
        int legs = sc.nextInt();
        int chickens = 0;
        int rabbits = 0;

        



        double temp = legs / 4;
        rabbits =(int)(temp - (heads - temp));
        chickens = heads - rabbits;

        if (legs != (chickens * 2 + rabbits * 4) || (heads != rabbits + chickens) || rabbits < 0) {
            System.out.println("The number of chickens and rabbits cannot be found.");
        } else {
            System.out.println("Chickens=" + chickens);
            System.out.println("Rabbits=" + rabbits);
        }


    }
}
