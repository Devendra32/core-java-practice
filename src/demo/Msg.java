package demo;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Msg {
    public static void main(String[] args) throws InterruptedException, AWTException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your msg here !!");
        String msg = sc.nextLine();
        System.out.println("How many msg do you want ?");
        int size = sc.nextInt();

        sc.close();
        StringSelection ss = new StringSelection(msg);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(ss, null);

        Thread.sleep(3000);

        for (int i = 1; i <= size; i++) {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);

            Thread.sleep(1000);
        }
    }
}
