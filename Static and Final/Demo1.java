import java.lang.*;

class hondaCity
{
    static int price = 10;
    int a, b;

    static public double price(String str)
    {
        switch (str)
        {
            case "delhi":
                return price + price*0.1;
            case "pune":
                return price + price*0.2;

        }
        return -1;
    }
}

public class Demo1 {
    public static void main(String[] args){
        System.out.println("In Main:");
        System.out.println("hondaCity.price = "+hondaCity.price);
        System.out.println("hondaCity.price = "+hondaCity.price("pune"));
    }
}
