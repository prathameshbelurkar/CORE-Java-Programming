import java.lang.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;


public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        // GREGORIAN CALENDER
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2021));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        // TIMEZONE
        // gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        


    }
}
