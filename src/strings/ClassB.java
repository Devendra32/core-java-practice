package strings;

public class ClassB {
  public static void main(String[] args) {
    String s1 = "Lal Singh";
    String s2 = "Bahadur";

        String fullName = s1.substring(0,4)+s2+" "+s1.substring(4);
        System.out.println(fullName);
  }
}
