import java.lang.*;
import java.util.Scanner;

interface myLambda {
    public void Display();
}

class useLambda {
    public void callLambda(myLambda ml) {
        ml.Display();
    }
}

class Demo {
    public void Method1() {
        useLambda ul = new useLambda();
        ul.callLambda(()->{
            System.out.println("Hello");
        });
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        Demo d = new Demo();
        d.Method1();

    }
}
