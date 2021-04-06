import java.lang.*;

/*
* We Cannot Create the object sof an interfaces;
* In Interfaces all the methods are abstract by default
*
* */

interface test
{
    //By Default Abstract Method.
    void Meth1();
    void Meth2();

}

class My implements test
{
      public void Meth1(){
          System.out.println("Meth1 of My class.");
      }
      public void Meth2(){
          System.out.println("Meth2 of My class.");
      }
      public void Meth3(){
          System.out.println("Meth3 of My class.");
      }
}

public class Practice1 {
    public static void main(String[] args){

        test m = new My();


    }
}