import java.lang.*;
import java.util.Scanner;

interface myLambda {
    public void Display();
}

class Demo {
    // This instance variable can be accessed by an Lambda Expression and can be modified.
    int temp = 10;
    public void Method1() {

        // Lambda Expressions can have only the Final variables or variables which are to be the final.
        int count = 0;
        myLambda ml = ()->{
            int x = 0;
            System.out.println("Hi");
            System.out.println("Bye "+(count)+" "+(++temp));
        };

        ml.Display();
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        Demo d = new Demo();
        d.Method1();

    }
}
