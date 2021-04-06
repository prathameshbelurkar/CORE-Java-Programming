import java.lang.*;
import java.util.Scanner;


public class MethodPractice1 {

    static void change(int A[], int index, int value)
    {
        A[index] = value;
    }

    static void change2(int x, int value)
    {
        x = value;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//______________PASSING OBJECT AS A PARAMETER________________________
        int A[] = {1, 2, 3 ,4 ,5};
        change(A, 2, 20);

        for (int x: A)
        {
            System.out.print(x+" ");
        }
        System.out.println("");

//______________PASSING VALUE AS A PARAMETER________________________
        int a = 25;
        change2(a, 36);
        System.out.println(a);



    }
}