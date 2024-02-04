package hackerrank.plusminus;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void plusMinus(List<Integer> arr) {

        double negative = arr.stream().filter(i -> i < 0).count();
        double zero = arr.stream().filter(i -> i == 0).count();
        double positive = arr.stream().filter(i -> i > 0).count();

        DecimalFormat df = new DecimalFormat("0.000000");

        String format = df.format(positive / arr.size());
        String format1 = df.format(negative / arr.size());
        String format2 = df.format(zero / arr.size());


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
