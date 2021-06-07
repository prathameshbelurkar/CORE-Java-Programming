import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.lang.*;
import java.util.Scanner;


public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis1 = new FileInputStream("C:/Users/SANJAY/Downloads/Challenge2/Source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/SANJAY/Downloads/Challenge2/Source2.txt");
        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Challenge2/Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();


    }
}