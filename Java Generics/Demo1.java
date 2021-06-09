import java.lang.*;
import java.util.Scanner;


public class Main<T> {
    T data[] =(T[]) new Object[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Main<String> gd = new Main();

        gd.data[0] = "hi";
        gd.data[0] = "bye";
        // gd.data[0] = 10; // NOT ALLOWED
        

    }
}