package java8practice;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer I1, Integer I2) {
        return I1-I2;
    }
}
