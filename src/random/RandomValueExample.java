package random;

import java.util.Random;
import java.util.UUID;

public class RandomValueExample {
    public void meth1() {
        Random ran = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(ran.nextInt(1, 9999));

        }
    }

    public void meth2(){
        String randomUUID = UUID.randomUUID().toString();
        System.out.println(randomUUID);
        System.out.println();
        
    }

    public static void main(String[] args) {
        RandomValueExample rve = new RandomValueExample();
        rve.meth2();
    }

}
