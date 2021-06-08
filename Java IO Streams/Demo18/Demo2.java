import java.lang.*;
import java.util.Scanner;
import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;
    float avg;
}


public class Demo2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Demo18/Test.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s = new Student();

        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.avg = dis.readFloat();

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
        System.out.println(s.avg);


        dis.close();
        fis.close();

    }
}