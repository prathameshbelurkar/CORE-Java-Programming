import java.lang.*;

//Static Inner Class
class Outer3
{
    int x = 10;
    static int y = 20;

    //Static class
    static class My5
    {
        public void show(){
            System.out.println(y);
        }
    }

    My5 m = new My5();

}

public class Practice5 {
    public static void main(String[] args){
        Outer3.My5 m  = new Outer3.My5();

        m.show();

    }
}