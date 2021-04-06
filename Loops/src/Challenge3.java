import java.lang.*;
import java.util.Scanner;


public class Challenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//______________DISPLAY A NUMBER IN WORDS EVEN WITH TAILING 0______________________
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int n = num;
        int rev = 0, r;
        String str = "";
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        str = str + rev;
        char c;
        for (int i = str.length()-1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid");
                    break;
            }
        }


    }
}