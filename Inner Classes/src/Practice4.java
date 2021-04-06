import java.lang.*;

interface My1
{
    public void show();
}

class Outer2
{
    public void display(){
        // Anonymous Class and Object
        My1 m = new My1(){ public void show(){ System.out.println("Hello. ");}};
        m.show();
    }
}


public class Practice4 {
    public static void main(String[] args){

    }
}