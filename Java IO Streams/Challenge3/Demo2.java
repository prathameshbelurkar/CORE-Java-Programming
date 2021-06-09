import java.io.DataInputStream;
import java.io.FileInputStream;
import java.lang.*;
import java.util.Scanner;


public class Demo2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Challenge3/Test.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;

        for (int i=0;i<length;i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();
    }
}