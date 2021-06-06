import java.lang.*;
import java.util.Scanner;

@FunctionalInterface
interface myLambda {
    public int Add(int x, int y);
}


public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Parameterized Anonymous Class
        // myLambda m = (a, b)->{return a+b;};
        myLambda m = (a, b)->a+b;  // Without Return Statement


        int r = m.Add(20, 30);
        System.out.println(r);
    }
}
