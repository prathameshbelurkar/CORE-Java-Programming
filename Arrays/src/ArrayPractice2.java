import java.lang.*;


public class ArrayPractice2 {
    public static void main(String[] args){

/*
//_____________________________INITIALIZATION OF 2D ARRAYS__________________________________
        int A[][] = new int[5][5]; //1

        int B[][] = {{1,2,3}, {4,5,6}, {7,8,9}}; //2

        int C[][];          //3
        C = new int[5][5];

        int []D[] = new int[5][5]; //4

        int[] E, F[]; //5
        E = new int[5];
        F = new int[5][5];
*/

/*
//______________________________DISPLAY ELEMENTS OF 2D ARRAY_______________________________
        int B[][] = {{1,2,3}, {4,5,6}, {7,8,9}};


*//*
        //Using for loop
        for (int i=0; i<B.length; i++)
        {
            for (int j=0; j<B[0].length; j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
        *//**//*



        //Using foreach loop
        *//*
*//*
        for (int x[]:B)
        {
            for (int y: x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        *//*

        */

/*

//_________________________________________JAGGED 2D ARRAY_______________________________________________________

        //Initialization
        int A[][];
        A = new int[3][]; //This will create three rows
        A[0] = new int[8];
        A[1] = new int[3];
        A[2] = new int[5];

        //Displaying the elements
        for (int i=0; i<A.length; i++)
        {
            for (int j=0; j<A[i].length; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        for (int x[]:A)
        {
            for (int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
*/














    }
}