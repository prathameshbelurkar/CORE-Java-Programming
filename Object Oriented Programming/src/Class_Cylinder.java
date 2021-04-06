import java.lang.*;
import java.util.Scanner;

class Cylinder
{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius * radius;
    }

    public double TotalSurfaceArea(){
        return 2 * lidArea() * Circumference() * height;
    }

    public double Circumference(){
        return 2 * Math.PI * radius * height;
    }

    public double Volume(){
        return Math.PI * radius * height;
    }
}

public class Class_Cylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cylinder c1 = new Cylinder();
        System.out.println("Enter the Radius: ");
        c1.radius = sc.nextInt();
        System.out.println("Enter the Height: ");
        c1.height = sc.nextInt();

        System.out.println("Circumference: "+c1.Circumference());
        System.out.println("Total Surface Area: "+c1.TotalSurfaceArea());
        System.out.println("Volume: "+c1.Volume());
        System.out.println("lidArea: "+c1.lidArea());

    }
}