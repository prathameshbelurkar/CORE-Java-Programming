import java.lang.*;


public class Challenge2 {
    public static void main(String[] args){

//        Checking whether the given number is binary or not
        int b = 110101;
        String str = b+"";
        System.out.println("Binary: "+str.matches("[01]+"));

//        Checking whether the given number is hexadecimal or not
        String str1 = "0546FD146";
        System.out.println("Hexadecimal: "+str1.matches("[0-9A-F]+"));

//        Checking whether the given date is in date format dd/mm/yyyy
        String str2 = "33/09/2000";
        System.out.println("In Date Format: "+str2.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}"));

    }
}