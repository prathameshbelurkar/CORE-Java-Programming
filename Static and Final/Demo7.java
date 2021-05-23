import java.lang.*;
import java.util.Date;

class Student {
    private String name;
    private String rollNo;
    private static int count = 1;

    private String generateRollNo() {
        Date d = new Date();
        String rn = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }

    public Student(String n) {
        rollNo = generateRollNo();
        name = n;
    }

    public void Show() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number is: " + rollNo);
    }

}

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("In Main:");
        Student s1 = new Student("John");
        Student s2 = new Student("Smith");
        s1.Show();
        s2.Show();
    }

}
