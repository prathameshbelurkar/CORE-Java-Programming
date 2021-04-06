import java.lang.*;

//_____________________MAXIMUM OF NUMBERS USING VARIABLE ARGUMENTS_____________________________
public class Challenge7 {

    static int max(int ...A){

        if (A.length == 0)
            return Integer.MIN_VALUE;
        int max = A[0];
        for (int i=1; i<A.length; i++){
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    public static void main(String[] args){

        System.out.println("Maximum: "+max());
        System.out.println("Maximum: "+max(1,2,3,5,4,6,8,9,7));

    }
}