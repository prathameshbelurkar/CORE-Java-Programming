import java.lang.*;
import java.util.Scanner;

@FunctionalInterface
interface myLambda {
    public void Display();
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Anonymous Inner Class, Can also be written in Single Line 
        myLambda m =
            ()-> {
                System.out.println("Hello World!");
            };

        m.Display();

    }
}
