import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.*;
import java.util.Scanner;


public class Demo6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        try (FileReader fr = new FileReader("C:/Users/SANJAY/Downloads/Demo6/Test.txt")) {
            int x;

            while ((x = fr.read()) != -1)
                    System.out.print((char)x);
            }
        }

    }
}