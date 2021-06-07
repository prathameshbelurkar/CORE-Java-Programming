import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.*;
import java.util.Scanner;


public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Challenge1/Source1.txt");
        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Challenge1/Source2.txt");

        int b;
        while ((b = fis.read()) != -1) {
            if (b>=65 && b<120) {
                fos.write(b+32);
            }
            else {
                fos.write(b);
            }
        }

        fis.close();
        fos.close();


    }
}