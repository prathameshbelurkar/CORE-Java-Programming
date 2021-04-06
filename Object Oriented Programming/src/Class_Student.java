import java.lang.*;
import java.util.Scanner;


class Student
{
    public int rollno;
    public String name;
    public String course;
    public double m1, m2, m3;

    public double total(){
        return (m1+m2+m3);
    }
    public double average(){
        return total() / 3;
    }
    public char Grade(){
        if (average() >= 70)
            return 'A';
        else if (average()>=60 && average()<=69)
            return 'B';
        else if (average()>=50 && average()<=59)
            return 'C';
        else if (average()>=40 && average()<=49)
            return 'D';
        else
            return 'F';
    }
}

public class Class_Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.println("Enter the Name: ");
        s1.name = sc.nextLine();

        System.out.println("Enter the Roll no.: ");
        s1.rollno = sc.nextInt();

        System.out.println("Enter the Course: ");
        s1.course = sc.nextLine();

        System.out.println("Enter the Marks of Subject 1: ");
        s1.m1 = sc.nextInt();

        System.out.println("Enter the Marks of Subject 2: ");
        s1.m2 = sc.nextInt();

        System.out.println("Enter the Marks of Subject 3: ");
        s1.m3 = sc.nextInt();

        System.out.println("Total: "+s1.total());
        System.out.println("Average: "+s1.average());
        System.out.println("Grade: "+s1.Grade());


    }
}