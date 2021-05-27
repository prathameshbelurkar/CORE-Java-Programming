import java.lang.*;
import java.util.Scanner;

class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return "Dimension of Rectangle of can't be Negative";
    }
}

public class Demo8 {

    static int Area(int l, int b) throws NegativeDimensionException {
        if (l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }

    static void Meth1() throws NegativeDimensionException{
        System.out.println("Area: " + Area(-10, 5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        try {
            Meth1();
        }
        catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }

}
