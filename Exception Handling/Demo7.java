import java.lang.*;
import java.util.Scanner;


public class Demo7 {

    static int Area(int l, int b) throws Exception {
        if (l<0 || b<0)
            throw new Exception();
        return l*b;
    }

    static void Meth1() throws Exception{
        System.out.println("Area: " + Area(-10, 5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        try {
            Meth1();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
