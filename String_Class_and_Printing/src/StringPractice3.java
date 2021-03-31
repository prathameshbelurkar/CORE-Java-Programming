import java.lang.*;


public class StringPractice3 {
    public static void main(String[] args){

        String str = "Mr. Shahrukh Khan";


//        Using the startwith and endwith methods
        System.out.println(str.startsWith("Mr."));
        System.out.println(str.startsWith("Shah", 4));
        System.out.println(str.endsWith("Khan"));

//        Using the char at method
        System.out.println(str.charAt(4));

//        Using the indexOf method
        String str2 = "www.udemy.co.in";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".", 4));
        System.out.println(str2.lastIndexOf("."));
        System.out.println(str2.indexOf("udemy"));

    }
}