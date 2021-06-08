import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Demo12/Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

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