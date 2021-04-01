import java.lang.*;
import java.util.Scanner;


public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//___________________________MENU DRIVEN PROGRAM FOR ARITHMETIC OPERATIONS____________________________________________
        System.out.println("Menu:");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Option in words ");
        String option = sc.nextLine();
        option = option.toUpperCase();

        switch (option) {
            case "ADD":
                System.out.println("Result: " + (a + b));
                break;
            case "SUB":
                System.out.println("Result: " + (a - b));
                break;
            case "MUL":
                System.out.println("Result: " + (a * b));
                break;
            case "DIV":
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }
}