import java.lang.*;
import java.util.Locale;

public class StringPractice2 {
    public static void main(String[] args){
        String str = new String("netbeans");

//        Printing the normal string
        System.out.println(str);

//        Printing the length of the string
        int len = str.length();
        System.out.println(len);

//        toUpperCase and toLowerCase methods
         String str1= str.toUpperCase();
         System.out.println(str1);

//         Using the trim method: which removes the heading and tailing spaces
        String str3 = "   netbeans   ";
        String str4 = str3.trim();
        System.out.println(str4);

//        Using the substring method
        String str5 = str.substring(3);
        String str6 = str.substring(3,7);
        System.out.println("str5: " + str5 + " and str6: " + str6);

//        Using the replace method
        String str7 = str.replace('e', 'M');
        System.out.println(str7);

    }
}