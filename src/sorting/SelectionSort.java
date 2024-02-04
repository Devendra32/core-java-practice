package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        new SelectionSort();

    }

    public SelectionSort() {
        int[] arr = new int[] { 30, 50, 20, 60, 10, 40 };

        // Before Sorting
        printArray(arr);

        // sort array
        selectionSort(arr);

        // After sorting
        System.out.println();
        printArray(arr);

    }

    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minimumTillNow = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimumTillNow] > arr[j]) {
                    minimumTillNow = j;
                }
            }

            if (minimumTillNow != i) {
                int temp = arr[minimumTillNow];
                arr[minimumTillNow] = arr[i];
                arr[i] = temp;
            }
        }

    }

    private void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
