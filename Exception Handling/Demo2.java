import java.lang.*;
import java.util.Scanner;


public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        try
        {
            int A[] = {30,25,24,36,0};
            int c = A[0] / A[3];
            System.out.println("Result is: " + c);
            System.out.println(A[5]);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be zero, " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index is out of bound, " + e);
        }
        finally
        {
            System.out.println("Bye");
        }


    }

}
