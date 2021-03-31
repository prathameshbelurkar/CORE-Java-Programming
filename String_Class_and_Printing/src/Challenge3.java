import java.lang.*;

public class Challenge3 {
    public static void main(String[] args){
//        Remove special characters from a string
        String str = "a#b$c%1^2&3;@";
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Result: "+str1);

//        Remove extra spaces from a string
        String str2 = "a              b             c   d  e    f g   h  i     j     k";
        String str3 = str2.replaceAll("\\s+", " ");
        System.out.println("Result: "+str3);

//        Find the number of words in a string
        String str4 = "abc def  ghi  jk lm ";
        str4 = str4.replaceAll("\\s+", " ").trim();
        String words[] = str4.split("\\s");
        System.out.println("Result: "+words.length);


    }
}