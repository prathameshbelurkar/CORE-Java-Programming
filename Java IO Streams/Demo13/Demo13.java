import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        FileReader fis = new FileReader("C:/Users/SANJAY/Downloads/Demo13/Test.txt");
        BufferedReader bis = new BufferedReader(fis);

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

    }
}