import java.lang.*;
import java.util.Scanner;


public class Demo2 extends Thread{

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

        Demo2 m = new Demo2();
        m.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }


    }
}
