import java.lang.*;
import java.util.Scanner;

public class Demo9 {

    static void Meth1() throws Exception {
        try {
            throw new Exception();
        }
        finally {
            System.out.println("Final Message");
        }
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
