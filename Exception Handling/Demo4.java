import java.lang.*;
import java.util.Scanner;
import java.io.*;

//Checked Exceptions: Try and Catch Block must be Present
public class Demo4 {

    static void fun1() {
        try {
            FileInputStream f = new FileInputStream("My.txt");

        } catch (Exception e) {
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
