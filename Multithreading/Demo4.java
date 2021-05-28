import java.lang.*;
import java.util.Scanner;

class myRunnable implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myRunnable r = new myRunnable();
        Thread t = new Thread(r);
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }


    }
}
