package hackerrank;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s2=s.trim();
        int count = 0;
        String[] stringTokens=s2.split("[ !,?._'@]+");
        if(!s2.isEmpty()){
          count = stringTokens.length;
        }
        System.out.println(count);
        
        for(String s1:stringTokens){
          System.out.println(s1);
        }
        
        scan.close();
    }
}
