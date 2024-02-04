package assesment;

import java.util.Scanner;

class Main {

    public static String StringChallenge(String sen) {
        String[] s = sen.trim().split(" ");
        String longestWord = s[0];
        for (int i = 0; i < s.length - 1; i++) {

            if (s[i].length() < s[i + 1].length()) {

                longestWord = s[i + 1];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {

        System.out.println(StringChallenge("Rameshwarsingh is bad boy..... For the masters"));
         Scanner s = new Scanner(System.in);
         System.out.print(StringChallenge(s.nextLine()));
        s.close();
    }

}