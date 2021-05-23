import java.lang.*;

class Test
{
    //Methods of Initiatizing final variable
    final int x = 10;
    final int y;

    Test()
    {
        y = 10;
    }
    
    // These Final method can't Override
    public final void show()
    {
        System.out.println("Hello");
    }
}

// Final class can't be extended
final class test1
{
    test1()
    {
        System.out.println("Hi");
    }
}


public class Demo5 {


    public static void main(String[] args) {
        System.out.println("In Main:");

    }

}
