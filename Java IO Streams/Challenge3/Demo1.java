import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.lang.*;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        float list[] = {8.7f, 552.2f, 63.154f, 21.23f, 23.23f};
        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Challenge3/Test.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for (float f:list) {
            dos.writeFloat(f);
        }

        dos.close();
        fos.close();
    }
}