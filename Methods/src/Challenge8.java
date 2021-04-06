import java.lang.*;

//_________________________SUM OF ALL ELEMENTS USING VARARGS____________________
public class Challenge8 {

    static int sum(int ...A){
        int s = 0;
        for (int i=0; i<A.length; i++){
            s = s + A[i];
        }
        return s;
    }

    public static void main(String[] args){
        System.out.println("Sum: "+sum(1,2,3,4,5));
    }
}