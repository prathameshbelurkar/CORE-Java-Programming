import java.lang.*;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Object o1 = new Object();
        Object o2 = o1;

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o1));


    }
}
