import java.lang.*;
import java.util.Scanner;


class myThread extends Thread {
    @Override
    public void run() {
        int count = 1;
        while(true) {
            System.out.println(count++);
        }
    }
}

public class Demo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myThread t = new myThread();
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
