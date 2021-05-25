import java.lang.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        try
        {
            int a, b;
            float res;
            System.out.println("Enter the two Numbers");
            a = sc.nextInt();
            b = sc.nextInt();
            res = a/b;
            System.out.println("Result is " + res);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Please Enter the Valid Numbers, " + e);
        }

    }

}