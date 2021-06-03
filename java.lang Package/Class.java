import java.lang.*;
import java.util.Scanner;


public class Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        /*        ---------------------------- FLOAT CLASS ----------------------------------- */
//        _______________________________________________________________
        float a = 12.5f;
        Float b = 12.5f / 0;
        Float c = -12.5f / 0;
        // System.out.println(b.isInfinite());                   //Checking Infinity
        // System.out.println(Float.POSITIVE_INFINITY == b);    // Checking Positive Infinity
        // System.out.println(Float.NEGATIVE_INFINITY == c);    // Checking Negative Infinity

//        ___________________________________________________________________
        Float z = (float) Math.sqrt(-1);
        Float y = (float) Math.sqrt(9);
        // System.out.println(z.isNaN()); // Checking Not a Number
        // System.out.println(y.isNaN()); // Checking Not a Number
        // System.out.println(z != Float.NaN);
        // System.out.println(y != Float.NaN);
        // System.out.println(Float.NaN != Float.NaN);

//        ___________________________________________________________________________________________________


        /*------------------------------------------- CHARACTER CLASS --------------------------------------------*/
        Character a = 'A';
        // Character.isLetter()
        // Character.isAlphabetic()
        // Character.isLowerCase()

//        _____________________________________________BOOLEAN CLASS_______________________________________________________
        // Boolean Classes
        // Boolean.getBoolean()
        // Boolean.logicalOr()
        // Boolean.valueOf()
        // Boolean.toString()




    }
}
