package demo;

import java.util.*;
import java.util.stream.*;


class Main {
    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public void meth1(){

         List<String> list = new ArrayList<>();
         list.add("Devendra");
         list.add("Shyam");
         list.add("Mohan");
         list.add("Krishna");
         list.add("Shyam");
         list.add("Vihari");
         list.add("Kanha");

         list.stream().filter(e -> e.startsWith("r")).forEach(System.out::println);
        // for(Iterator<String> itr = list.listIterator(); itr.hasNext(); ){
        // System.out.println(itr.next());
        // }

        // Sorting
         Collections.sort(list);
        // Reverse Sorting
         Collections.sort(list, (I1,I2)->I2.compareTo(I1));

         System.out.println(list);
    }

    public void removeDuplicates(){
         Integer[] arr = {34,12,43,65,23,54,12,32,34,21,54,12};
         Set<Integer> set = new HashSet<>();

         List<Integer> duplicateValues = Stream.of(arr).filter(i ->
         !set.add(i)).collect(Collectors.toList());
         System.out.println(duplicateValues);
    }

    public void meth3(){
        // for (Days day : Days.values()) {
        // System.out.println(day);
        // }

        // Arrays.stream(Days.values()).forEach(System.out::println);
         Stream.of(Days.values())
                .forEach(System.out::println);
    }

     String sort(String s) {
        String s2 = s.toLowerCase();
        char[] charArr = s2.toCharArray();
//        for (char c: charArr) {
//            System.out.println(c);
//        }
        for (int i = 0; i < charArr.length - 1; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] > charArr[j]) {
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }
        String s1 = new String(charArr);
        return s1;
    }

    public static void main(String args[]) {
        Main obj = new Main();
        obj.meth1();
        //obj.meth3();
    
        //System.out.println(obj.sort("Devendra"));

    }
}
