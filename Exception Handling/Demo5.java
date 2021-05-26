import java.lang.*;
import java.util.Scanner;

// Defining Our Own Exception Class: Checked Exception
class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance Must be greater than 5000";
    }
}

public class Demo5 {

    static void fun1() {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
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
