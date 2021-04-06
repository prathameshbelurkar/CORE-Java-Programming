import java.lang.*;


public class LoopPractice {
    public static void main(String[] args){

//__________________________WHILE LOOP______________________________________________________
        int i = 1;
        while (i<100)
        {
            System.out.println(i);
            i = i * 2;
        }
//__________________________DO-WHILE LOOP______________________________________________________
        i = 1;
        do
        {
            System.out.println(i);
            i = i * 2;
        }while (i<100);

    }
}