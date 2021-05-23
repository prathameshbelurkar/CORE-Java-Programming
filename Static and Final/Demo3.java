import java.lang.*;

public class Demo3 {

    static
    {
        System.out.println("Static Block 1");
    }

    public static void main(String[] args) {
        System.out.println("In Main:");

    }

    static
    {
        System.out.println("Static Block 2");
    }
}
