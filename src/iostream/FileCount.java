package iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {
  public static void main(String[] args) throws IOException
  {
    String line;
    int characters=0;
    int words=0;
    int sentences=0;
    int totalLine=0;

    BufferedReader br = new BufferedReader(new FileReader("D:\\file.txt"));
    while ((line =br.readLine())!=null) {

      totalLine++;
      characters+=line.length();
      String word[] =line.split("\\s+");
      words+=word.length;
      String sentence[] = line.split("[.]+");
      sentences += sentence.length;
    }
    br.close();

    System.out.println("Characters : "+characters);
    System.out.println("Words : "+words);
    System.out.println("Sentences : "+sentences);
    System.out.println("Lines : "+totalLine);
  } 
}