import java.lang.*;
import java.util.Locale;
import java.util.Scanner;

interface myLambda {
    public int Display(String str1, String str2);
}


public class Demo8 {

    public Main(String str) {
        System.out.println(str.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Assigning String Method compareTo to Display Method in myLambda.
        myLambda ml = String::compareTo;
        System.out.println(ml.Display("Hello", "Hello"));

    }
}
