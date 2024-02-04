package constructor;

public class ClassA {
  private String name;
  private String city;
  private String email;

  void meth1() {
    System.out.println(name + " " + city + " " + email);
  }

  {
    // instance block
    this.name = "Dev";
    this.city = "Agra";
    this.email = "dev@mail.com";
  }

  public static void main(String[] args) {
    // ClassA aobj = new ClassA("Dev", "Agra", "dev@mail.com");
    ClassA aobj = new ClassA();

    aobj.meth1();
  }
}
