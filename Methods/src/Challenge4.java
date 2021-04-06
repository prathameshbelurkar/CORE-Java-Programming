import java.lang.*;


public class Challenge4 {

//__________________________________OVERLOADEDS METHOD TO CALCULATE AREA_____________________________
    static double area(double r)
    {
        return Math.PI * r * r;
    }

    static double area(double l, double b)
    {
        return l*b;
    }
    static double area(double l, double b, double h)
    {
        return (0.5 * (l + b)) * h;
    }

    public static void main(String[] args){
        double r = 5, l = 10, b = 6, h = 12;

        System.out.println("Area: "+area(l,b));

    }
}