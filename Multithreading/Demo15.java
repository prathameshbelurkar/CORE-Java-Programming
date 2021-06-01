import java.lang.*;
import java.util.Scanner;

class WhiteBoard {
    String text;
    int numberofStudents = 0;
    int count = 0;

    public void Attandance() {
        numberofStudents++;
    }

    synchronized public void Write(String str) {
        System.out.println("Teacher is writing " + str);
        while (count != 0) {
            try {
                wait();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        text = str;
        count = numberofStudents;
        notifyAll();
    }

    synchronized public String Read() {
        while (count == 0) {
            try {
                wait();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        String str = text;
        count--;
        if (count == 0) {
            notify();
        }
        return str;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;

    String notes[] = {"Java is a Language",
                        "It is OOPs", "It is Platform Independent",
                            "It Supports Thread",
                                "end"};

    public Teacher(WhiteBoard w) {
        wb = w;
    }

    @Override
    public void run() {
        for (int i=0; i<notes.length; i++) {
            wb.Write(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    WhiteBoard wb;

    Student (WhiteBoard w, String name) {
        wb = w;
        this.name = name;
    }

    @Override
    public void run() {
        String text;
        wb.Attandance();

        do {
            text = wb.Read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        } while (!text.equals("end"));
    }
}

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student(wb, "Smith");
        Student s2 = new Student(wb, "Ron");
        Student s3 = new Student(wb, "John");
        Student s4 = new Student(wb, "Alex");

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
