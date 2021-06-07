import java.lang.*;
import java.util.Scanner;
import java.io.*;


public class Demo10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        bos.writeTo(new FileOutputStream("C:/Users/SANJAY/Downloads/Test.txt"));

        bos.close();

    }
}
