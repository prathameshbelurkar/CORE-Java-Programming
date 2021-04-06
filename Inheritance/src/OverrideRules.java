class Super2
        {
private void display()//or even protected may not give any error.
        {
        System.out.println("Super display.");

        }
        }

class Sub2 extends Super2
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");

    }
}

public class OverrideRules {

    public static void main(String[] args) {

        Sub2 s=new Sub2();

    }

}