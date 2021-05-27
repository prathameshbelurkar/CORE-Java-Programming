import java.lang.*;
import java.util.Scanner;


public class Demo6 {

    static int meth3() {
        return 5 / 0;
    }

    static void meth2() {
        meth3();
    }

    static void meth1() {
        meth2();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        try {
            meth1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

}
