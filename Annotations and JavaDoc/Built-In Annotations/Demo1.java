import java.lang.*;
import java.util.Scanner;

abstract class Parent {
    abstract public void Display();
}

class Child extends Parent {

//    This annotation is used to override the method
    @Override
    public void Display() {

    }
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

    }
}