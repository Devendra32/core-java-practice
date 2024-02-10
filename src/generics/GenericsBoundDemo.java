package generics;

class A {}

class B extends A {}

class C extends A {}

class MyClass<T extends A> {

}

public class GenericsBoundDemo {
  public static void main(String[] args) {
      MyClass<A> m1 = new MyClass<>();
      MyClass<B> m2 = new MyClass<>();
      MyClass<C> m3 = new MyClass<>();
      //MyClass<String> m4 = new MyClass<>(); //C.E.
  }
}
