import java.lang.*;
import java.util.Scanner;


public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

//        ________________________________________________________________________________
        Integer m1 = 15;
        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("1010", 2);     // Decimal Number
        Integer m4 = Integer.valueOf("A7", 16);      // Hexadecimal
        Integer m5 = Integer.decode("0xA7");                // Hexadecimal

        // System.out.println(m2);
        // System.out.println(m3);
        // System.out.println(m5);


//        ___________________________ Static Methods ______________________________________

        // System.out.println(Integer.parseInt("123"));          //This will convert to the String.
        // System.out.println(Integer.toBinaryString(40));       // This will convert to Binary Number.



    }
}
