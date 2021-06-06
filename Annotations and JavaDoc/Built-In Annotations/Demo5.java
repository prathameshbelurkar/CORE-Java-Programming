import java.lang.*;
import java.util.Scanner;


class My<T> {
    @SafeVarargs
    private void Show(T...arg) {
            for (T x:arg) {
                System.out.println(x);
            }
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

    }
}
