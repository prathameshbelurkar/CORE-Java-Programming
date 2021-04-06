import java.lang.*;
import java.util.Scanner;

//_____________________________________FIND MAXIMUM ELEMENT IN AN ARRAY_______________________________________
public class Challenge3 {

    static int max(int A[]) {
        int m = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > m)
                m = A[i];
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1, 2, 3, 4, 5};

        int max_element = max(A);
        System.out.println("Maximum: " + max_element);

    }
}