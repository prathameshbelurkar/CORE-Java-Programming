import java.lang.*;
import java.util.Scanner;

@FunctionalInterface
interface myLambda {
    public void Display();
}

//class My implements myLambda {
//    @Override
//    public void Display() {
//        System.out.println("Hello World!");
//    }
//}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Anonymous Inner Class 
        myLambda m = new myLambda() {
            @Override
            public void Display() {
                System.out.println("Hello World!");
            }
        };
        m.Display();

    }
}
