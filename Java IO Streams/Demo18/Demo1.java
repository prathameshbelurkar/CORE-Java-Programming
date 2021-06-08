import java.lang.*;
import java.util.Scanner;
import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;
    float avg;
}


public class Demo1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Demo18/Test.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";
        s.avg = 80.5f;

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.writeFloat(s.avg);
          

        dos.close();
        fos.close();

    }
}