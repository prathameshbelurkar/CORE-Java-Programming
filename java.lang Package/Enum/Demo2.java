import java.lang.*;
import java.util.Scanner;

enum Dept {
    CS, IT, CIVIL, ECE;  // All these Constants are in Capitals.

    private Dept() {
        System.out.println(this.name());
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Dept d = Dept.CIVIL;
/*
        switch (d) {
            case CS: System.out.println("Head: John\nBlock A");
                     break;
            case IT: System.out.println("Head: Srinivas\nBlock B");
                break;
            case CIVIL: System.out.println("Head: Smith\nBlock C");
                break;
            case ECE: System.out.println("Head: Dave\nBlock D");
                break;
        }

 */

    }
}
