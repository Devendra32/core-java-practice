package patterns;

import java.io.*;

class Pattern1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n, i, j, a;
    System.out.print("Enter N value:");
    n = Integer.parseInt(br.readLine());

    for (i = n; i >= 1; i--) {
      a = ((4 * i) - 3);
      for (j = 1; j < n; j++) {
        System.out.print((a++) + "*");
      }
      System.out.println(a++);
    }
  }
}