package ref;

public class Stuff {

    public Stuff(){
        System.out.println("inside the stuff constructor");

    }

    public static void doStuff() {
        System.out.println("I'm doing this task !!");
    }

    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

