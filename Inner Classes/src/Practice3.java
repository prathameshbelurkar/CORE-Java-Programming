import java.lang.*;

/*Anonymous class*/
abstract class My
{
    abstract public void show();
}

class Outer1
{
    public void display(){
        // Anonymous Class
        My m = new My(){
            public void show(){
                System.out.println("Hello. ");
            }
        };
        m.show();
    }
}

public class Practice3 {
    public static void main(String[] args){

    }
}