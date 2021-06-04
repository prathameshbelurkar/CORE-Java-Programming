import java.lang.*;
import java.util.Scanner;

enum Dept {
    CS, IT, CIVIL, ECE;  // All these Constants are in Capitals.

    private Dept() {
        System.out.println(this.name());
    }

    public void Display() {
        System.out.println(this.name() + " " + this.ordinal());
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Dept d = Dept.CIVIL;
        d.Display();

    }
}
