package java8practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComparatorExample {

        public static void main(String[] args) {

                 ArrayList<Integer> list = new ArrayList<>();
                 list.add(10);
                 list.add(0);
                 list.add(25);
                 list.add(15);
                 list.add(5);
                // System.out.println("Before Sorting : "+list);

                // Sort without lambda
                // Default Sorting (ASC Order)
                // Collections.sort(list);
                // System.out.println("After Sorting(Default) : "+list);

                // Custom Sorting (DSC Order)
                // Collections.sort(list, (I1, I2)-> I2-I1);
                // System.out.println(("After Sorting(Custom) : "+list));

                // Sorting with lambda
                // Custom Sorting (DSC Order)
                // Collections.sort(list, (I1,I2)-> (I1>I2)?-1:(I1<I2)?1:0);
                // Collections.sort(list, (I1,I2)-> I1.compareTo(I2));
                // System.out.println(("After Sorting(Custom using lambda) : "+list));
                // Custom sorting using lambda expression and comparator
                // TreeSet<Integer> integersSet = new
                // TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
                // integersSet.add(10);
                // integersSet.add(25);
                // integersSet.add(15);
                // integersSet.add(0);
                // integersSet.add(5);
                //
                // System.out.println(integersSet);

                // TreeMap custom key wise sorting using lambda and comparator
                 TreeMap<Integer, String> treeMap = new TreeMap<>();
                 treeMap.put(400,"Devendra");
                 treeMap.put(100,"Ram");
                 treeMap.put(900,"Shyam");
                 treeMap.put(200,"Harsh");
                 treeMap.put(500,"Rahul");
                // System.out.println(treeMap);
                
                
        

                List<Student> studentList = new ArrayList<>();
                studentList.add(new Student(400l, "Devendra", "MCA"));
                studentList.add(new Student(100l, "Sachin", "MCA"));
                studentList.add(new Student(300l, "Rahul", "MCA"));
                studentList.add(new Student(500l, "Shyam", "MCA"));
                studentList.add(new Student(200l, "Ram", "MCA"));
                
                System.out.println(studentList);
                //System.out.println("--------------------------------");
                // Sorted Student by Roll No
                // Collections.sort(studentList, (s1,s2)-> (int)(s1.getStRollNo()-s2.getStRollNo()));
                // Collections.sort(studentList, (s1,s2)->(s1.getStName().compareTo(s2.getStName())));
                //studentList.stream().forEach(System.out::println);

                studentList.stream().map(Student::getStName)
                .forEach(System.out::println);
       

                // Predicate interface example
                // Arrays.asList(43,32,52,13,64,12,32,54,43,24,84,13).stream().filter(e->e%2==0).forEach(System.out::println);

                //List<Integer> list = new ArrayList<>();
                //list.add(1);
                //list.add(2);
                //list.add(3);
                //list.add(4);
                //list.add(3);
                //list.add(2);
                //list.add(1);



        }
}
