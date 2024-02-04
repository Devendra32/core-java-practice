package strings;

import java.util.Scanner;

public class TripletCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        // Input value of d
        System.out.println("Enter the value of d:");
        int d = scanner.nextInt();
        
        // Output the result
        int result = getTripletCount(a, d);
        System.out.println("Number of triplets whose sum is divisible by d: " + result);
        scanner.close();
        
    }
    
    public static int getTripletCount(int[] a, int d) {
        int n = a.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((a[i] + a[j] + a[k]) % d == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}