import java.lang.*;


public class MethodPractice {

    //_____STATIC METHOD____
    static int max(int x, int y) {
        if (x>y)
            return x;
        else
            return y;
    }
    //_____NON-STATIC METHOD____
    int min(int x, int y) {
        if (x>y)
            return y;
        else
            return x;
    }

    public static void main(String[] args) {
        int a=10, b=15;

        //CALL TO STATIC METHOD
        System.out.println(max(a,b));

        //CALL TO NON-STATIC METHOD
        MethodPractice mp = new MethodPractice();
        System.out.println(mp.min(a, b));

    }
}