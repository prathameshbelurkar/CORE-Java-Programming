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


public class Demo2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        FileInputStream fis = new FileInputStream("C:/Users/SANJAY/Downloads/Demo19/Test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();
        System.out.println(s.toString());


        fis.close();
        ois.close();

    }
}
