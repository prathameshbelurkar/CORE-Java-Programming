import java.lang.*;

public class RegularExpressions {
    public static void main(String[] args) {

//        '.' for checking any character
        String str = "f";
        System.out.println(str.matches("."));

//        '[abc]' means checking the string which contains single character whether is a or b or c
        String str1 = "ab";
        System.out.println(str.matches("[abc]"));
        System.out.println(str1.matches("[abc]"));

//        '[^abc]' means checking the string which contains single character whether is not in a or b or c
        String str2 = "p";
        System.out.println(str2.matches("[^abc]"));

//        '[a-z0-9]' means checking the string which contains single character whether is (a to z) or (0 to 9)
        System.out.println(str2.matches("[a-z0-9]"));

//        '[a-z][0-9]' means checking the string which contains character's whether is 1st char:(a to z)  2nd char:(0 to 9)
        String str3 = "a7";
        System.out.println(str3.matches("[a-z][0-9]"));

//        a|b means: Only a or b is allowed in string
        System.out.println(str.matches("a|b"));

//        "abc" means: given string must be exactly "abc"
        String str4 = "abc";
        System.out.println(str4.matches("abc"));
        System.out.println(str.matches("abc"));

//        "\w" means: any alphabet or digit & "\W" means: other than alphabet or digit
        String str5 = "3";
        System.out.println(str5.matches("\\w"));  //Extra slash is for Escape Character
        System.out.println(str5.matches("\\W"));  //Extra slash is for Escape Character

//        "\d" means: any digit & "\D" means: any non-digit
        System.out.println(str5.matches("\\d"));  //Extra slash is for Escape Character
        System.out.println(str5.matches("\\D"));  //Extra slash is for Escape Character


//        "\s" means: space & "\S" means: not space
        String str6 = " ";
        System.out.println(str6.matches("\\s"));
        System.out.println(str6.matches("\\S"));


    }
}