import java.lang.*;
import java.util.Scanner;


class myThread extends Thread {
    public myThread(String name) {
        super(name);
        setPriority(Thread.NORM_PRIORITY+2);
    }
}

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myThread t = new myThread("My Thread 1");

        System.out.println("ID: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("State: "+t.getState());
        System.out.println("Alive: " + t.isAlive());


    }
}
