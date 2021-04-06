import java.lang.*;
import java.util.Scanner;


public class Challenge2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
//_____________________DISPLAY NUMBER OF DIGITS__________________________
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int r = 0;
        while (num > 0)
        {
            r = num % 10;
            num = num / 10;
            System.out.println(r);
        }

         */

/*
//_____________________COUNT DIGITS OF A NUMBER__________________________
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Number Of Digits are "+count);
*/
/*
//_____________________FINDING A NUMBER IS A ARMSTRONG OR NOT__________________________
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int n = num;
        int r, sum = 0;
        while (n > 0)
        {
            r = n % 10;
            n = n / 10;
            sum = sum + (r*r*r);
        }

        if (sum == num)
        {
            System.out.println("Number is a Armstrong.");
        }
        else
        {
            System.out.println("Number is Not a Armstrong.");
        }

 */



/*
//_____________________REVERSE A NUMBER__________________________
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int n = num;
        int rev = 0, r;

        while (n > 0)
        {
            r = n % 10;
            rev = rev*10 + r;
            n = n / 10;
        }

        System.out.println("Reverse of a Number: "+ rev);
*/


/*

        //_____________________CHECK A NUMBER IS PALINDROME__________________________
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int n = num;
        int rev = 0, r;

        while (n > 0)
        {
            r = n % 10;
            rev = rev*10 + r;
            n = n / 10;
        }

        if (num == rev)
        {
            System.out.println("Given Number is a Palindrome. ");
        }
        else
        {
            System.out.println("Given Number is not a Palindrome. ");
        }
*/


    }
}