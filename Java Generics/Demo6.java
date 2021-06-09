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

public class Demo6 {

    // GENERIC METHOD
    static void fun(myArray obj) {
        obj.Display();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        myArray<String> ma1 = new myArray<>();
        ma1.Append("Hi");
        ma1.Append("Bye");
        ma1.Append("New");

        myArray<Integer> ma2 = new myArray<>();
        ma2.Append(10);
        ma2.Append(20);
        ma2.Append(30);

        fun(ma1);
        fun(ma2);


    }
}
