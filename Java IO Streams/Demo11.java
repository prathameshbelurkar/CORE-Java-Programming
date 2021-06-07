import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        CharArrayReader cr = new CharArrayReader(c);

        int x;
        while ((x = cr.read()) != -1) {
            System.out.print((char) x);
        }

        cr.close();

    }
}
