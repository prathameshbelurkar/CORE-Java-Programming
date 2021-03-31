import java.lang.*;


public class RegularExpressions2 {
    public static void main(String[] args){
        String str1 = "abcdef";

//        NOTE: '+' means 1 or more no of times & '*' means 0 or any no. of times.
//        👇
//        .* means: anything is allowed and any number of times.
//        [a-z]* means: anything is allowed and any number of times between a to z.
//        [abc]* means: only a or b or c is allowed and any number of times
//        [abc]{3} means: only a,b or c is allowed and only 3 number of times(i.e string must contains only 3 char).
//        [abc]{3,7} means: only a,b or c is allowed and only more than 3 number of times but upto 7.
//        .* means: anything is allowed and any number of times.


        String str2 = "john@gmail.com";
        System.out.println(str2.matches("\\w*@gmail(.*)"));



        System.out.println();
    }
}