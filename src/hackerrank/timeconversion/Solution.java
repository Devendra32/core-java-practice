package hackerrank.timeconversion;
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
      String check = s.substring(8);
      String date = s.substring(0,8);
       String[] dateArr = date.split(":");
       System.out.println(Arrays.toString(dateArr));
       int hh= Integer.parseInt(dateArr[0]);
       
      if(check.equals("PM")){
          if(hh!=12){
            hh+=12;
          }
      }else{
        if (hh==12) {
          hh=0;
        }
      }
      String hhh =Integer.toString(hh);
      if (hhh.length()==1) {
        hhh="0"+hhh;
      }
      return hhh+":"+dateArr[1]+":"+dateArr[2];
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = bufferedReader.readLine();

        String result = Result.timeConversion("12:01:55AM");
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}