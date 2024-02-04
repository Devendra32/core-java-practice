package java8practice;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
      //Scanner sc = new Scanner(System.in);
      //int n = sc.nextInt();
      ////int b = sc.nextInt();

      ////System.out.println(n+" "+b);

      //List<Integer> list = new ArrayList<>(n);
      //for (int i = 0; i < n; i++) {
      //  list.add(sc.nextInt());
      //}

      Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>(N);
        
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            List<Integer> list2 = new ArrayList<>(d);
            for(int j = 0; j<d; j++){
                list2.add(sc.nextInt());
            }
            list.add(list2);
        }

        final int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(list.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

      //for (List<Integer> i : list) {
      //  System.out.print(i+" ");
      //}
      sc.close();



    }
}
