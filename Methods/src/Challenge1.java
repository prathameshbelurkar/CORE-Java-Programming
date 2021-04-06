import java.lang.*;
import java.util.Scanner;

//____________________________FIND A NUMBER IS PRIME OR NOT_____________________________
public class Challenge1 {

    static boolean isPrime(int n)
    {
        for (int i=2; i<=n/2 ;i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if (isPrime(num) == true)
        {
            System.out.println("Number is Prime.");
        }
        else
        {
            System.out.println("Number is not a Prime.");
        }


    }
}