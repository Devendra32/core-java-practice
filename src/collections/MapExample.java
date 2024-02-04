package collections;

import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        map.put("ten",10);

//        for (Map.Entry<String, Integer> value : map.entrySet()){
//            System.out.println(value.getKey()+" "+value.getValue());
//        }
        map.entrySet().stream().forEach(System.out::println);
        System.out.println(map.entrySet());
        
    }

}
