import java.lang.*;
import java.util.Scanner;
import java.io.*;

class Student implements Serializable {

    private String name;
    private String dept;
    private float avg;
    private int rollno;
    public static int data = 10;
    public transient int t;

    Student() {}

    Student(int r, String n, String d, float a) {
        name = n;
        dept = d;
        avg = a;
        rollno = r;
        data = 500;
        t = 500;
    }

    public String toString() {
        return "\nRoll No: "+rollno+
                "\nName: "+name+
                "\nDept: "+dept+
                "\nAvg: "+avg+
                "\ndata: "+data+
                "\nt: "+t+"\n";
    }
}


public class Demo19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileOutputStream fos = new FileOutputStream("C:/Users/SANJAY/Downloads/Demo19/Test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(30, "John", "CSE", 80.3f);

        oos.writeObject(s);

        fos.close();
        oos.close();

    }
}