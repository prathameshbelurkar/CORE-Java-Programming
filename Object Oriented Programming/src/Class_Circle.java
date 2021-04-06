import java.lang.*;
import java.util.Scanner;

class Circle
{
//    Properties
    public double radius;

//    Methods
    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double circumference()
    {
        return perimeter();
    }

}

public class Class_Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Creating an Object
        Circle c1 = new Circle();

        c1.radius = 7;
        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
//        Creating an Object
        Circle c2 = new Circle();

        c2.radius = 9;
        System.out.println("Area: "+c2.area());
        System.out.println("Perimeter: "+c2.perimeter());
        System.out.println("Circumference: "+c2.circumference());


    }
}