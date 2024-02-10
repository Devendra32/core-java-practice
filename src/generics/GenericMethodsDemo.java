package generics;

class MyArray<T> {

  @SuppressWarnings("unchecked")
  private T arr[] = (T[]) new Object[10];
  int length = 0;

  public void append(T v) {
    arr[length++] = v;
  }

  public void display() {
    for (int i = 0; i < length; i++) {
      System.out.println(arr[i]);
    }
  }
}

public class GenericMethodsDemo {

  static <E> void show(E[] list) {
    for (E e : list) {
      System.out.println(e);
    }
  }

  static <E> void show1(E... list) {
    for (E e : list) {
      System.out.println(e);
    }
  }

  static <T> void meth1(MyArray<T> obj) { // wildcard
    obj.display();
  }

  static void meth2(MyArray<?> obj) { // un-bounded wildcard //similar as (MyArray obj) no type safety
    obj.display();
  }
  /*
   * with a wildcard extends or super can be used 
   * super -> Lower Bound
   * extends -> Upper Bound
   * 
   */
  static void meth3(MyArray<? extends Number> obj) {
    obj.display();
  }

  public static void main(String[] args) {
    // show(new String[] { "shyam", "ram", "hari", "rakesh" });
    // show(new Integer[] { 10, 20, 30, 40, 50 });

    // show1(10, 20, 30, 40, 50);
    // show1("ram", "rakesh", "haresh");

    MyArray<String> m1 = new MyArray<>();
    m1.append("haresh");
    m1.append("ram");
    m1.append("hari");

    MyArray<Double> m2 = new MyArray<>();
    m2.append(10.5);
    m2.append(25.05);
    m2.append(70.50);

    MyArray<Double> m3 = new MyArray<>();
    m3.append(10.5);
    m3.append(25.05);
    m3.append(70.50);

    MyArray<String> m4 = new MyArray<>();
    m4.append("Ram");

    // meth1(m1);
    // meth1(m2);
    // meth3(m3); //Byte, Short, Long, Double, Integer can be used because these
    // wrapper classes extends Number class
    // meth3(m4); //C.E. because String class doesn't extends String class

  }
}
