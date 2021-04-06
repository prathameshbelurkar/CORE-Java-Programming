import java.lang.*;

/*Nested Inner Class*/
class Outer
{
    int x = 10;
    Inner obj = new Inner(); // Available to all Class.

    class Inner
    {
        int y = 20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}


public class Practice1 {
    public static void main(String[] args){
        Outer o = new Outer();
        o.outerDisplay();

        // Directly Creating the Inner Class Object.
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();



    }
}