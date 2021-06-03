import java.lang.*;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // Integer
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

//        ______________________________ Declarations _______________________________________________________
        // Byte
        Byte c = 15;
        Byte d = Byte.valueOf("15");
                    // Byte d = Byte.valueof(15) // This is Invalid as 15 is a Literal.
        Byte bb = 15;
        Byte e = Byte.valueOf(bb);

        // Short
        Short s = Short.valueOf("123");

        // Float
        Float ff = 12.23f;
        Float fh = Float.valueOf("12.5");

        // Double
        Double dd = Double.valueOf("1235.22");
        Double df = Double.valueOf(235.22);

        // Character
        Character cc = Character.valueOf('A');

        // Boolean
        Boolean l = Boolean.valueOf("true");

//____________________________________________________________________________________________________

        Byte qq = 15; //Here qq is a variable
        Byte q1 = Byte.valueOf("15"); // Here q1 is a Object.

//____________________________________________________________________________________________________
        Float fff = Float.valueOf("100.2222");
        float x = fff.floatValue();
        float y = fff; // fff Objects float value is assigned to the y .Therefore, y = 10.2222

//_________________________________________________________________________________________________________
        int m = 10;
        Integer n = Integer.valueOf(m); // We're Making an Object. Therefore, This is known as Boxing.
        int p = n // Autounboxing
        

    }
}
