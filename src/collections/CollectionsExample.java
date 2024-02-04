package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsExample {
    public void listExample() {
//        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = new LinkedList<>();
//        list.add(45);
//        list.add(12);
//        list.add(47);
//        list.add(34);
//        list.add(78);
//        list.add(13);
//        list.add(10);
//        System.out.println(list);
//        list.clear();//It will clear the list
//        list.remove(0);
        //retrieve data using for loop
//      for (int i = 0; i < list.size(); i++) {
//          System.out.println(list.get(i));
//      }

        //retrieve data using for each loop
//        for (Integer intValue:list){
//            System.out.println(intValue);
//        }

        //retrieve data using iterator
//        for (Iterator it=list.iterator(); it.hasNext();){
//            System.out.println(it.next());
//        }

        //retrieve data using stream
//        list.stream().forEach(System.out::println);

        //retrieve data using list iterator
//        Collections.sort(list);
//        ListIterator<Integer> lit = list.listIterator();
//        lit.next();
//        lit.next();
//        lit.set(20); //It will update the value at the cursor
//        lit.add(50); //It will add where the cursor is.
//        System.out.println(lit.hasPrevious());
//        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student(500, "Rakesh", "ECE"));
        students.add(new Student(104, "Suresh", "CS"));
        students.add(new Student(105, "Naresh", "EC"));
        students.add(new Student(100, "Prateek", "EEE"));
        students.add(new Student(100, "Pavan", "EEE"));
        students.add(new Student(600, "Karan", "ECE"));
        students.add(new Student(400, "Lokesh", "EC"));
        students.add(new Student(395, "Dharmendra", "EDE"));

        students.stream().forEach(System.out::println);
//        Collections.sort(students,(o1,o2)->o1.getStudentName().compareTo(o2.getStudentName()));
//        Collections.sort(students,(o1,o2)->o1.getRollNumber()- o2.getRollNumber());

        System.out.println("----------------");

        List<String> studentNames = students.stream()
                .sorted((O1, O2) -> O1.getStudentName().compareTo(O2.getStudentName()))
                .map(student -> student.getStudentName())
//                .forEach(System.out::println);

                .collect(Collectors.toList());
        System.out.println(studentNames);
    }

    public void setExamples(){

    }


    public static void main(String[] args) {
        CollectionsExample obj = new CollectionsExample();
        obj.listExample();

    }
}
