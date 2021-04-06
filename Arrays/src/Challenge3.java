import java.lang.*;


public class Challenge3 {

    public static void main(String[] args){
/*
//______________________COPYING AN ARRAY___________________________
        int A[] = {1,2,3,4,5,6,7,8,9,0};
        int B[] = new int[10];

        for (int i=0; i<A.length ;i++)
        {
            B[i] = A[i];
        }
        System.out.println("Array B: ");
        for (int x:B)
        {
            System.out.print(x + ",");
        }
*/
/*

//______________________REVERSE COPYING AN ARRAY___________________________
        int A[] = {1,2,3,4,5,6,7,8,9,0};
        int B[] = new int[10];

        for (int i=(A.length-1), j=0; i>=0; i--, j++)
        {
            B[j] = A[i];
        }
        System.out.println("Array B: ");
        for (int x:B)
        {
            System.out.print(x + ",");
        }
*/
/*

//______________________INCREASING SIZE OF AN ARRAY___________________________
        int A[] = {1,2,3,4,5};
        int B[] = new int[2*A.length];

        System.out.println("Size of Array: "+ A.length);

        for (int i=0; i<A.length; i++)
        {
            B[i] = A[i];
        }

        B = A;
        B = null;
        System.out.println("Size of Array: "+ A.length);
        for (int x:A)
        {
            System.out.print(x+",");
        }
*/

    }
}