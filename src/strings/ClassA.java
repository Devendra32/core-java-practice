package strings;

public class ClassA {
    String reverseWords(String s) {
        String reversedString = "";
        String[] words = s.split("\\.");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + ".";
        }
        return reversedString+="\b";
    }

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(new ClassA().reverseWords(s));

    }
}
