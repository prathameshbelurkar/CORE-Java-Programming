import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student {
    int rollno;
    String name;
    String dept;
}

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Demo17/Test.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);


    }
}