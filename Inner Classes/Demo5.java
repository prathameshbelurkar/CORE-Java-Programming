import java.lang.*;

class Outer
{
    static int x = 10;
    int y = 10;
    static class Inner
    {
        public void innerDisplay()
        {
            System.out.println("x="+x);
            //          System.out.println("y="+y); // NOT ALLOWED

        }
    }
    public void outerDisplay()
    {
        System.out.println("y="+y);
    }
}

public class Demo5 {
    public static void main(String[] args){
        System.out.println("In Main:");
        Outer o = new Outer();
        Outer.Inner i= new Outer.Inner();
        i.innerDisplay();
        o.outerDisplay();
    }
}
