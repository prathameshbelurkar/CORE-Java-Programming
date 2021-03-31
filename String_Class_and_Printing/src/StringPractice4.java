import java.lang.*;

public class StringPractice4 {
    public static void main(String[] args) {

//        Using the equals and equalsIgnoreCase method
        String str1 = "Pyramid";
        String str2 = "pyramid";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str2); // compares the address's of object's not the actual string

//        Using the compareTo and compareToIgnoreCase method
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

//        Using the contains method
        String str3 = "the great wall ";
        System.out.println(str3.contains("wall"));

//        concatenation of two strings
        String str4 = "of china";
        System.out.println(str3.concat(str4));

//        Converting any type of data to the string type of data
        int d = 10;
        String str5 = String.valueOf(d);
        System.out.println(str5);

    }
}