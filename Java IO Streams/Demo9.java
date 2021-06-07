import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b[] = bos.toByteArray();
        for (byte x:b)
            System.out.println((char)x);
        


        bos.close();

    }
}
