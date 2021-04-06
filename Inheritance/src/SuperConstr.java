import java.lang.*;

class Parent1
{
    Parent1()
    {
        System.out.println("Non-Param of parent");
    }
    Parent1(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child1 extends Parent1
{
    Child1()
    {
        System.out.println("Non-Param of child");
    }
    Child1(int y)
    {
        System.out.println("Param of child");
    }
    Child1(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child1 c=new Child1();
        //Child1 c=new Child1(20);
        Child1 c=new Child1(10,20);
    }

}