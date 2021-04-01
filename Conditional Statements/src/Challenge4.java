import java.lang.*;
import java.util.Scanner;


public class Challenge4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
//_______________________DISPLAY NAME OF A DAY BASED ON NUMBER__________________________________________________
        int day;
        System.out.println("Enter Day Number: ");
        day = sc.nextInt();

        switch (day)
        {
            case 1:System.out.println("Mon");
            break;
            case 2:System.out.println("Tue");
            break;
            case 3:System.out.println("Wed");
            break;
            case 4:System.out.println("Thu");
            break;
            case 5:System.out.println("Fri");
            break;
            case 6:System.out.println("Sat");
            break;
            case 7:System.out.println("Sun");
            break;
            default:System.out.println("invalid");
            break;

        }
 */

        /*
//_______________________DISPLAY NAME OF A MONTH BASED ON NUMBER__________________________________________________
        System.out.println("Enter the Month Number: ");
        int num = sc.nextInt();

        switch (num)
        {
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            default: System.out.println("Invalid");
            break;
        }
         */

        /*
//_______________________DISPLAY NAME OF A NUMBER BASED ON NUMBER__________________________________________________
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        switch (num)
        {
            case 0:System.out.println("Zero");
            break;
            case 1:System.out.println("One");
            break;
            case 2:System.out.println("Two");
            break;
            case 3:System.out.println("Three");
            break;
            case 4:System.out.println("Four");
            break;
            case 5:System.out.println("Five");
            break;
            case 6:System.out.println("Six");
            break;
            case 7:System.out.println("Seven");
            break;
            case 8:System.out.println("Eight");
            break;
            case 9:System.out.println("Nine");
            break;
            default:System.out.println("Invalid");
            break;
        }
         */

//_____________________________DISPLAY TYPE OF A WEBSITE_________________________________________________________
        System.out.println("Enter the Domain: ");
        String str = sc.nextLine();
        String ext = str.substring(str.lastIndexOf(".") + 1, str.length());

        switch (ext)
        {
            case "com":System.out.println("Commercial");
            break;
            case "org":System.out.println("Organisation");
            break;
            case "net":System.out.println("Network");
            break;
            case "gov":System.out.println("Government Official");
            break;
            default:System.out.println("Invalid");
            break;
        }



    }
}