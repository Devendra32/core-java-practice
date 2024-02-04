package hackerrank.minmax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Integer[] arr1 = new Integer[arr.size()];
        Long[] sumArr = new Long[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            arr1[i] = arr.get(i);
        }
//        Arrays.asList(arr1).stream().forEach(System.out::println);

        for (int i = 0; i < arr1.length; i++) {
            long sum = 0;
            for (int j = 0; j < arr1.length; j++) {
                if (j == i) {
                    continue;
                } else {
                    sum += arr1[j];
                }
            }
            sumArr[i]=sum;
        }

        List<Long> sumList = Arrays.asList(sumArr);
        long min=sumList.get(0);
        long max=sumList.get(0);
        for (long num: sumList) {
            if (min>num){
                min=num;
            }
            if (max<num){
                max=num;
            }
        }
        System.out.println(min+" "+max);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
