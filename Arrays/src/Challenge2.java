import java.lang.*;
import java.util.Scanner;


public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
//____________________ROTATING(LEFT) AN ELEMENT_________________________
        int A[] = {1,2,3,4,5,6,7,8,9,0};
        int temp = A[0];

        for (int i=1; i<A.length ;i++)
        {
            A[i-1] = A[i];
        }
        A[A.length - 1] = temp;

        for (int x:A)
        {
            System.out.print(x+",");
        }
*/
/*

//____________________ROTATING(RIGHT) AN ELEMENT_________________________
        int A[] = {1,2,3,4,5,6,7,8,9,0};
        int temp = A[A.length - 1];

        for (int i=A.length - 1 ;i>=1 ;i--)
        {
            A[i] = A[i-1];
        }
        A[0] = temp;

        for (int x:A)
        {
            System.out.print(x+",");
        }
*/
/*

//____________________INSERTING AN ELEMENT_________________________
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;

        int n = 5;
        int index = 2;
        int element = 20;

        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ",");
        }

        for (int i = n; i < index; i--)
            A[i] = A[i - 1];
        A[index] = element;

        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ",");
        }
*/
/*

//____________________DELETING AN ELEMENT_________________________
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;


        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }

        int length = 5;
        int index= 2;
        for (int i=index; i<length-1; i++)
            A[i] = A[i+1];

        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
*/



    }
}