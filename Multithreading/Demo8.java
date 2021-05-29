import java.lang.*;
import java.util.Scanner;


class myThread extends Thread {
    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
        }
    }
}

public class Demo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myThread t = new myThread();
        t.start();

        Thread mainthread = Thread.currentThread();
        try {
            mainthread.join();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
