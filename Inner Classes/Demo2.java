import java.lang.*;

class Outer
{
    int x = 10;
    class Inner
    {
        int y = 20;
        Inner()
        {
            System.out.println("Inner class obejct craeted ");
        }
        public void innerDisplay()
        {
            System.out.println("y="+y);
        }
    }
    public void outerDisplay()
    {
        System.out.println("x="+x);
    }
    public void addOuter()
    {
        Inner i = new Inner();
        int z = i.y + x;
        System.out.println("z="+z);
    }
}

public class Demo2 {
    public static void main(String[] args){
        System.out.println("In Main:");
        Outer o = new Outer();
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
        o.outerDisplay();
        o.addOuter();

    }
}
