import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;


public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Demo3/Test.txt");
            String str = "Learn Java Programming";

            byte b[] = str.getBytes();
            fos.write(b, 6, str.length()-6);

        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }



    }
}