import java.lang.*;

/*LocalInner Class */

class Outer_
{
    public void display(){
        class Inner
        {
            public void show(){
                System.out.println("Hello. ");
            }
        }
        Inner i = new Inner();
        i.show();
        new Inner().show(); // Object.show() [Using Anonymous Object]
    }
}

public class Practice2 {
    public static void main(String[] args){
        Outer_ o = new Outer_();
        o.display();

    }
}