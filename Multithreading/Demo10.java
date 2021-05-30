import java.lang.*;
import java.util.Scanner;


class MyData {
    public void Display(String str) {
        for (int i=0; i<str.length() ;i++) {
            System.out.print(str.charAt(i));
        }
    }
}

class myThread1 extends Thread {
    MyData d;
    myThread1 (MyData dat) {
        d = dat;
    }

    @Override
    public void run() {
        d.Display("Hello World");
    }
}

class myThread2 extends Thread {
    MyData data;
    myThread2 (MyData dat) {
        data = dat;
    }

    @Override
    public void run() {
        data.Display("Welcome All");
    }
}

public class Demo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        MyData data = new MyData();
        myThread1 t1 = new myThread1(data);
        myThread2 t2 = new myThread2(data);

        t1.start();
        t2.start();


    }
}
