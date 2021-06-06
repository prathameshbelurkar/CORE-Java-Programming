import java.lang.*;
import java.util.Locale;
import java.util.Scanner;

interface myLambda {
    public void Display(String str);
}


public class Demo7 {

    public Main(String str) {
        System.out.println(str.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Assigning Constructor of Main Class to Display Method.
        myLambda ml = Main::new;
        ml.Display("Hello");

    }
}
