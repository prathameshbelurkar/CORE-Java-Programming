import java.lang.*;
import java.util.Scanner;

// User-Defined Annotation
@interface MyAnno {
    String Name();

    String Project();

    String Date();

    String Version() default "13";
}

// Annotation at Class
@MyAnno(Name = "Prathamesh", Project = "Bank", Date = "1/1/2020")
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        int x;

    }
}
