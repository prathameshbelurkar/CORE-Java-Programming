import java.lang.*;

class Rectangle1 {
    private double length;
    private double breadth;

    //    Setters
    public void setlength(double l) {
        if (l >= 0)
            length = l;
        else
            length = 1;
    }

    public void setbreadth(double b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 1;
    }

    //    Getters
    public double getlength() {
        return length;
    }

    public double getbreadth() {
        return breadth;
    }

    //  Non-Parameterized Constructor
    public Rectangle1() {
        length = 1;
        breadth = 1;
    }

    //    Parameterized Constructor
    public Rectangle1(double l, double b) {
        setlength(l);
        setbreadth(b);
    }

    public Rectangle1(double s) {
        length = breadth = s;
    }


}

public class rectangletest {
    public static void main(String[] args) {

        Rectangle1 r = new Rectangle1();
        Rectangle1 r1 = new Rectangle1(10, 5);
        Rectangle1 r2 = new Rectangle1(5);


    }
}