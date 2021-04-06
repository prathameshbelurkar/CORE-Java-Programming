import java.lang.*;
import java.util.Scanner;

class Rectangle
{
    public float length;
    public float breadth;

    public float Area()
    {
        return length * breadth;
    }

    public float Perimeter()
    {
        return 2 * (length + breadth);
    }

    public boolean isSquare()
    {
        if (length == breadth)
            return true;
        return false;
    }

}

public class Class_Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        System.out.println("Enter the Length: ");
        r1.length = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        r1.breadth = sc.nextInt();

        System.out.println("\n");
        System.out.println("Area: "+r1.Area());
        System.out.println("Perimeter: "+r1.Perimeter());
        System.out.println("Is Square: "+r1.isSquare());



    }
}