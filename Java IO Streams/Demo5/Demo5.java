import java.io.FileInputStream;
import java.lang.*;
import java.util.Scanner;


public class Demo5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        try (FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Demo4/Test.txt")) {
            int x;

            do
            {
                x = fis.read();
                if (x != -1)
                    System.out.print((char)x);
            } while (x != -1);
        }

    }
}
