import java.io.FileInputStream;
import java.lang.*;
import java.util.Scanner;


public class Demo4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        try (FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Demo4/Test.txt")) {
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
        }

    }
}
