import java.lang.*;
import java.util.Scanner;


public class Challenge1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*

//_______________________DISPLAY MULTIPLICATION TABLE____________________________
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        for (int i = 1; i<=10 ;i++)
        {
            System.out.println(num+"x"+i+" = "+(num*i));
        }
         */
        /*

//___________________________FIND SUM OF N NUMBERS_______________________________
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=num ; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum: "+ sum);

         */

//________________________________FACTORIAL OF A NUMBER_______________________________
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial: "+ fact);

    }
}