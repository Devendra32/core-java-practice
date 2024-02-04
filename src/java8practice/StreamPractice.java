package java8practice;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;


public class StreamPractice {
    public static void main(String[] args) {
        Integer[] arr = {12,32,54,35,85,12,53,34,32,54,32,34};
        Set<Integer> set = new TreeSet<>();

        Stream.of(arr).filter(i -> !set.add(i)).toList().forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("set elements: ");
        set.stream().forEach(System.out::println);
    }
}
