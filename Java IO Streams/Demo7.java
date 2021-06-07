import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        }

    }
}
