package assesment;

public class Engagebey {
    public int findNearestNumber(int arr[], int n){
        int a=n+1;
        int b=n-1;
        int nearestNumber=n;

        for (int i = 0; i < arr.length; i++) {
          if (arr[i]==a||arr[i]==b) {
            nearestNumber=arr[i];
            break;
          }
        }
      return nearestNumber;
    }
    public static void main(String[] args) {
      int arr[] = {-7,-5,-3,-2,2,3,4,5,7,8,9};
      System.out.println(new Engagebey().findNearestNumber(arr, 0));
    }
}
