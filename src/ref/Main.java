package ref;

public class Main {
    public static void main(String[] args) {
        //Static method Reference
        //ClassName::MethodName
        WorkInter workInter = Stuff::doStuff;
        workInter.doThis();

        //Non-static method Reference
        //ClassObject::MethodName
        Stuff stuff = new Stuff();
        Runnable runnable = stuff::printTable;
        Thread d = new Thread(runnable);
        d.start();

        //Constructor Reference
        //ClassName::new(Keyword)
        workInter = Stuff::new;
        
    }
}
