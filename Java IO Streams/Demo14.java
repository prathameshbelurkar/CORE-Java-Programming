import java.lang.*;
import java.util.Scanner;
import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: " + count);
                System.out.flush();
                try {Thread.sleep(10); } catch(Exception e){System.out.println(e); }
                count++;
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        is = i;
    }

    @Override
    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(10);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}

public class Demo14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

    }
}
