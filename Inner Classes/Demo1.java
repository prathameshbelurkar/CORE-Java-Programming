import java.lang.*;

class Outer
{
    int x =10;

    class Inner
    {
        int y = 20;
        Inner()
        {
            System.out.println("Inner Class Object Created");
        }
        public void innerDisplay()
        {
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }

    public void outerDisplay()
    {
        Inner i = new Inner();
        i.innerDisplay();
    }
}


public class Demo1 {
    public static void main(String[] args){
        System.out.println("In Main:");
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();

    }
}
