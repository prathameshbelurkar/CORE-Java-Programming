import java.lang.*;
import java.util.Scanner;

enum Dept {
    CS, IT, CIVIL, ECE  // All these Constants are in Capitals.
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Dept d = Dept.CIVIL;
        Dept list[] = Dept.values();

        // System.out.println(d);
        // System.out.println(Dept.valueOf("IT"));

        // Printing Using for each Loop
        for (Dept x: list)
            System.out.println(x);


    }
}