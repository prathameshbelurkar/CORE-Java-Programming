import java.lang.*;

class Test
{
    static
    {
        System.out.println("Static Block 1");
    }

    static
    {
        System.out.println("Static Block 2");
    }
}

public class Demo4 {


    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("In Main:");
        Test t2 = new Test();

    }

}
