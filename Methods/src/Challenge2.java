import java.lang.*;
import java.util.Scanner;

//_____________________________FIND GCD OF TWO NUMBERS_______________________________________
public class Challenge2 {

    static int gcd(int a, int b)
    {
        while (a != b)
        {
          if (a > b)
              a = a - b;
          else
              b = b - a;
        }
        return a;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two Numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int res = gcd(m, n);
        System.out.println("GCD: "+res);


    }
}