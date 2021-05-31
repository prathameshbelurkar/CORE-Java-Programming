import java.lang.*;
import java.util.Scanner;


class myData {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        value = v;
        flag = false;
        notify();

    }

    synchronized public int get() {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread {
    myData data;
    Producer (myData d) {
        this.data = d;
    }
    @Override
    public void run() {
        int count = 1;
        while (true) {
            data.set(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    myData data;
    Consumer (myData d) {
        this.data = d;
    }
    @Override
    public void run() {
        int value;
        value = data.get();
        System.out.println("Consumer: "+value);
    }
}

public class Demo14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myData d = new myData();
        Consumer c = new Consumer(d);
        Producer p = new Producer(d);

        c.start();
        p.start();

    }
}
