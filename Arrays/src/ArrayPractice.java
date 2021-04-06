import java.lang.*;


public class ArrayPractice {
    public static void main(String[] args){

//______________________METHODS FOR INITIALIZING AN ARRAY_______________________
        int A[] = new int[10]; //1
        int B[] = {1,2,3,4,5}; //2
        int C[];               //3
        C = new int[10];
        int []D = new int[10]; //4

//______________________ACCESSING AN ELEMENTS OF AN ARRAY_______________________
        B[2] = 15; //1

        for (int i = 0; i<B.length ;i++) //2
        {
            System.out.println(B[i]);
        }

        for (int x:B)                    //3 Using foreach loop
        {
            System.out.println(x);
        }


    }
}