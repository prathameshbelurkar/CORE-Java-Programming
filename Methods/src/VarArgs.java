import java.lang.*;

//________________________________VARIABLE LIST ARGUMENTS________________________________
public class VarArgs {

    static void show(int... A) {
        for (int x : A) {
            System.out.println(x);
        }
    }
    static void showList(int start, String ...S){

        for (int i=0; i<S.length; i++){
            System.out.println(start+". "+S[i]);
            start++;
        }

    }

    public static void main(String[] args) {
//_______________________________________________________________________________________________________
        show(); //with no arguments.
        show(10,20,30); //with any number of arguments arguments.

        /*
        👇Passing an Array which is not referenced: Therefore it is called Anonymous Array. It
          is created in fly....means it i created when the method is called and automatically
          gets destroyed when the method gets fully executed.
        */
        show(new int[]{1,2,3,4,5,6,7,8,9,10});


//_______________________________________________________________________________________________________
        showList(5, "John", "Smith", "Ajay", "Prathamesh");



    }
}