import java.lang.*;
import java.util.Scanner;


class myThread extends Thread {
    public myThread(String name) {
        super(name);
        setPriority(Thread.NORM_PRIORITY+2);
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(10*10*10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Demo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myThread t = new myThread("My Thread 1");

        t.start();
        t.interrupt();



    }
}
