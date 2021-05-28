import java.lang.*;
import java.util.Scanner;

class MyThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        MyThread t = new MyThread();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }


    }
}
