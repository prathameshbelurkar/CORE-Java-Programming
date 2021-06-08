import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.*;
import java.util.Scanner;

class Student {
    int rollno;
    String name;
    String dept;
}

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Demo15/Test.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

    }
}