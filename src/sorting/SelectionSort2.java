package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = {30, 50, 20, 10, 40, 60, 10, 50, 30};

        //Printing Original Array
        System.out.println("Original Array: ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

        //Sort the array
        int[] sortedArray = new SelectionSort2().selectionSort(arr);

        //Printing Sorted Array
        System.out.println("\n\nSorted Array: ");
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }

        //Duplicate Values in Array
        System.out.println("\n\nDuplicate Values : "+new SelectionSort2().duplicateValues(new SelectionSort2().selectionSort(arr)));


    }

    public int[] selectionSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public List<Integer> duplicateValues(int [] arr){
        List<Integer> duplicateValues = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateValues.add(arr[j]);
                }
            }
        }
        return duplicateValues;
    }
}