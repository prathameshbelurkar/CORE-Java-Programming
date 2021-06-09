import java.lang.*;
import java.util.Scanner;

class myArray<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void Append(T v) {
        A[length++] = v;
    }

    public void Display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myArray<Integer> ma = new myArray<>();

        ma.Append(10);
        ma.Append(20);
        ma.Append(30);

        ma.Display();

    }
}
