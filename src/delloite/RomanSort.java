import java.util.*;

public class RomanSort {
    
    // Function to convert integer to Roman numeral
    static String intToRoman(int num) {
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder roman = new StringBuilder();
        
        int i = 12;
        while (num > 0) {
            int div = num / values[i];
            num %= values[i];
            while (div-- > 0) roman.append(romanSymbols[i]);
            i--;
        }
        return roman.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        
        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Convert integers to Roman numerals
        String[] romanArray = new String[n];
        for (int i = 0; i < n; i++) {
            romanArray[i] = intToRoman(arr[i]);
        }
        
        // Sort Roman numerals
        Arrays.sort(romanArray);
        
        // Output sorted Roman numerals
        for (String numeral : romanArray) {
            System.out.println(numeral);
        }
    }
}