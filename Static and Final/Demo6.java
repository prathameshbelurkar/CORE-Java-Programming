import java.lang.*;

class coffeeMachine
{
    private int milkQty;
    private int coffeeQty;
    private int waterQty;
    private int sugarQty;

    static private coffeeMachine my = null;

    private coffeeMachine()
    {
        milkQty = 1;
        sugarQty = 1;
        coffeeQty = 1;
        waterQty = 1;
    }

    public void fillwater(int qty)
    {
        waterQty = qty;
    }

    public void fillmilk(int qty)
    {
        milkQty = qty;
    }

    static coffeeMachine getInstance()
    {
        if (my == null)
           my = new coffeeMachine();
        return my;
    }
}

public class Demo6 {


    public static void main(String[] args) {
        System.out.println("In Main:");

        coffeeMachine c1 = coffeeMachine.getInstance();
        coffeeMachine c2 = coffeeMachine.getInstance();
        coffeeMachine c3 = coffeeMachine.getInstance();

        if (c1 == c2 && c2 == c3)
            System.out.println("Same");

    }

}
