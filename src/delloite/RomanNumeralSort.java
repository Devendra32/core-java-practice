import java.util.*;

public class RomanNumeralSort {

    // Map to store the integer values corresponding to Roman numerals
    private static final Map<Character, Integer> ROMAN_VALUES = new HashMap<>();
    
    static {
        ROMAN_VALUES.put('I', 1);
        ROMAN_VALUES.put('V', 5);
        ROMAN_VALUES.put('X', 10);
        ROMAN_VALUES.put('L', 50);
        ROMAN_VALUES.put('C', 100);
        ROMAN_VALUES.put('D', 500);
        ROMAN_VALUES.put('M', 1000);
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 100, 1, 50};
        System.out.println("Original Array: " + Arrays.toString(array));
        sortArrayBasedOnRomanNumerals(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void sortArrayBasedOnRomanNumerals(int[] arr) {
        Integer[] integers = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integers[i] = arr[i];
        }

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return toRomanNumeral(o1).compareTo(toRomanNumeral(o2));
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = integers[i];
        }
    }

    public static String toRomanNumeral(int num) {
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : ROMAN_VALUES.entrySet()) {
            char numeral = entry.getKey();
            int value = entry.getValue();
            while (num >= value) {
                roman.append(numeral);
                num -= value;
            }
            if (num == 0)
                break;
        }
        return roman.toString();
    }
}
