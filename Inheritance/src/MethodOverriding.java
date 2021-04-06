import java.lang.*;

class Super
{
    public void display(){
        System.out.println("super class display");
    }
}

class Sub extends Super
{
    @Override
    public void display(){
        System.out.println("sub class display.");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        Super sup = new Super();
        sup.display();
        System.out.println("\n");


        Sub s = new Sub();
        s.display();
        System.out.println("\n");

        Super su = new Sub();
        su.display();
        System.out.println("\n");
    }
}