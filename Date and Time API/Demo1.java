import java.lang.*;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // GET CURREMT TIME IN MILLIS
        // System.out.println(System.currentTimeMillis());

        // DATE CLASS
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getHours());
        System.out.println(d.getTimezoneOffset());

    }
}