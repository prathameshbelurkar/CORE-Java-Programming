import java.lang.*;
import java.util.Scanner;


public class Demo3 {

    static void fun1() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        fun3();


    }

}
