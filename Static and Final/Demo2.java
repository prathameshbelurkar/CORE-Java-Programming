import java.lang.*;

class Test {
    static int x = 10;
    int y = 20;

    public void show() {
        System.out.println("x=" + x + ", y=" + y);
    }

    static public void Display() {
        System.out.println("x= " + x);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("In Main:");
        Test t = new Test();
        Test t1 = new Test();

        System.out.println(Test.x);
        t.show();
        t.x = 50;
        t.y = 10;
        t.show();
        t1.show();
    }
}
