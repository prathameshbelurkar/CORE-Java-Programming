import java.lang.*;

class Test2
{
    static
    {
        System.out.println("Test2 Block1");
    }
    static
    {
        System.out.println("Test2 Block2");
    }

}

public class StaticBlocks {

    static
    {
        System.out.println("Block1");
    }

    public static void main(String[] args){
        System.out.println("main");
        Test2 t2 = new Test2();
    }

    static
    {
        System.out.println("Block2");
    }
}