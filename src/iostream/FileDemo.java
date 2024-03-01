package iostream;

import java.io.*;

public class FileDemo {
  int chars;
  int words;
  int sentences;
  int lines;

  public void countData() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("D:\\file.txt"));
    int i;
    while ((i = br.read()) != -1) {
      System.out.print((char)i);
      if ((char) i != '\n') {
        chars++;
      }
      if ((char)i == ' ' || (char)i == '\n') {
        words++;
      } else if ((char) i == '.') {
        sentences++;
      }
      if ((char) i == '\n') {
        lines++;
      }
    }
    br.close();
  }

  public static void main(String[] args) throws IOException
  {
     FileDemo obj= new FileDemo();
     obj.countData();
     System.out.println("\n-----------");
    System.out.println("Characters : "+obj.chars);
    System.out.println("Words : "+obj.words);
    System.out.println("Sentences : "+obj.sentences);
    System.out.println("Lines : "+obj.lines);
  }

}
