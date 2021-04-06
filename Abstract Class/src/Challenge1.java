import java.lang.*;

abstract class Shape
{
    abstract public double Perimeter();
    abstract public double Area();
}

class Circle extends Shape
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, breadth;

    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    public double Perimeter(){
        return 2*(length + breadth);
    }
    public double Area(){
        return length*breadth;
    }
}

public class Challenge1 {
    public static void main(String[] args){

        Shape c, r;

        c = new Circle(5);
        r = new Rectangle(10, 2);

        System.out.println("Circle Perimeter: " + c.Perimeter());
        System.out.println("Circle Area: " + c.Area());
        System.out.println("\n");

        System.out.println("Rectangle Perimeter: " + r.Perimeter());
        System.out.println("Rectangle Area: " + r.Area());
        System.out.println("\n");

    }
}