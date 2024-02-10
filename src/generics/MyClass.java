package generics;
/*    No Parameters
 *    Multiple parameters
 *    Sybtypes
 *    Bounded Types
 *     
 *    Generic Methods
 *    WildCard ?
 *    Lower Bound
 *    Upper Bound
 *  */


//Generic Class
class MyClassA<T>{

  private T obj;

  public void setObj(T obj){
    this.obj = obj;
  }

  public T getObj(){
    return obj;
  }
}

class MyArray<T>{

  @SuppressWarnings("unchecked")
  private T arr[] = (T[]) new Object[10];
  int length = 0;
  public void append(T v){
    arr[length++]=v;
  }

  public void display(){
      for(int i=0; i<length; i++){
        System.out.println(arr[i]);
      }
  }
}

public class MyClass {
  public static void main(String[] args) {

    //MyClassA<String> m1 = new MyClassA<>();

    //m1.setObj("Devendra");
    //System.out.println(m1.getObj());
    //m1.setObj(20); //C.E.
    
    MyArray<String> m1 = new MyArray<>();
    m1.append("Ram");
    m1.append("Shyam");
    m1.append("Hari");
    m1.append("John");
    
    m1.display();

  }
}
