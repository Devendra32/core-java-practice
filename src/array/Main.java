package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Source W3Resource.com

        // 1. Write a Java program to sort a numeric array and a string array.

        int arr[] = { 89, 12, 54, 23, 76, 43, 87, 54, 32, 42, 74, 73, 53, 25 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
//        for(int i: arr){
//            System.out.print(i+" ");
//        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}