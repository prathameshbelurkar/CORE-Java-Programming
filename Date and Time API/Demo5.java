import java.lang.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;


public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now();

        // DATETIMEFORMATTER

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        // System.out.println(df.format(dt));

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        // System.out.println(df.format(zdt));

        // CHRONOFIELD
        // System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        // System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
        // System.out.println(dt.get(ChronoField.YEAR));


    }
}
