import java.lang.*;

class Test1
{
    static int x = 10;
    int y = 20;

    void Show(){
        System.out.println(x+" "+y);
    }
    //Can only access the static variable adn methods
    static void display(){
        System.out.println(x);
    }

}

public class StaticPractice1 {
    public static void main(String[] args){

        Test1 t1 = new Test1();
        t1.Show();
        t1.x = 30;
        t1.y = 40;

        Test1 t2 = new Test1();
        t2.Show();
    }
}