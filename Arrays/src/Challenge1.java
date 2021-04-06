import java.lang.*;
import java.util.Scanner;


public class Challenge1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*

//___________________________FINDING SUM OF ALL ELEMENTS__________________________________
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i<A.length ;i++)
        {
            sum = sum + A[i];
        }

        System.out.println("Sum is "+sum);

*/
/*

//___________________________SEARCHING AN ELEMENT__________________________________
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the Element to Search: ");
        int key = sc.nextInt();

        for (int i=0; i<A.length ;i++)
        {
            if (A[i] == key)
            {
                System.out.println("Element found at index "+i);
                System.exit(0);
            }
        }
        System.out.println("Element not found.");
*/
/*

//___________________________FINDING MAXIMUM ELEMENT__________________________________
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int max = A[0];

        for (int i=1; i<A.length ;i++)
        {
            if (A[i] > max)
            {
                max = A[i];
            }
        }
        System.out.println("Maximum Element is "+ max);
*/
/*

//___________________________FINDING SECOND LARGEST ELEMENT__________________________________
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int max1, max2;
        max1 = max2 = A[0];

        for (int i=0; i<A.length ;i++)
        {
            if (A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if (A[i] > max2)
            {
                max2 = A[i];
            }
        }
        System.out.println("Second Largest Element is "+ max2);
*/

    }
}