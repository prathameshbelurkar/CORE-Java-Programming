import java.lang.*;
import java.util.Scanner;


public class Demo5 {

    // GENERIC METHOD
    static <E> void show(E... list) {
        for (E x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        show("New", "Hi", "Bye");
        show(10, 20, 30);

    }
}
