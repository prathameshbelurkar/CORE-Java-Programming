import java.lang.*;
import java.util.Scanner;


public class Demo3 implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Demo3 m = new Demo3();
        Thread t = new Thread(m);
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }


    }
}
