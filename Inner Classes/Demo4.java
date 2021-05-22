import java.lang.*;

interface My
{
    public void Display();
}

class Outer
{
    public void Meth1()
    {
        My m = new My(){
          @Override
          public void Display()
          {
              System.out.println("This is Display");
          }
        };
        m.Display();
    }
}

public class Demo4 {
    public static void main(String[] args){
        System.out.println("In Main:");
        Outer o = new Outer();
        o.Meth1();
    }
}
