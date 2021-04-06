import java.lang.*;

//______________________OVERLOADED METHOD TO REVERSE INT OR ARRAY__________________
public class Challenge5 {

    static int reverse(int n){
        int r = 0;
        while (n != 0)
        {
            r = r*10 + n % 10;
            n = n / 10;
        }
        return r;
    }

    static int[] reverse(int A[]){
        int B[] = new int[A.length];
        for (int i=A.length-1, j=0; i>=0 ; i--, j++)
        {
            B[i]=A[i];
        }

        return B;
    }

    public static void main(String[] args){
        int num = 532;
        int C[] = {1,2,3,4,5};
        System.out.println("Reverse: "+reverse(C));
    }
}