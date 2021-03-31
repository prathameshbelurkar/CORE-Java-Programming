import java.lang.*;

public class StringPractice1 {
    public static void main(String[] args) {
//      String vreated in pool
        String str1 = "Java Program";
        System.out.println(str1);

//      String created in heap as well as in pool also but object referenced to str2
        String str2 = new String("JAVA");
        System.out.println(str2);

//      String created using charaacter array
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);
        System.out.println(str3);

//        String created using the byte array
        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        System.out.println(str4);

//      _____________________________________***_______________________________________________
        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6);

//      _____________________________________***_______________________________________________
        String str7 = "Java";
        String str8 = new String("Java");
        System.out.println(str7 == str8);


    }
}