import java.lang.*;
import java.util.Scanner;

interface myLambda {
    public void Display(String str);
}


public class Main {

    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void Demo6(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Means the Display method in myLambda becomes the System.out.println();
        myLambda ml = System.out::println;
        ml.Display("Hello");

    }
}
