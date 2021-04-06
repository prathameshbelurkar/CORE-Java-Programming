import java.lang.*;

//_______________________________METHOD OVERLOADING___________________________________________________
public class MethodPractice2 {

    static int max(int x, int y)
    {
        return x>y?x:y;
    }

    static float max(float x, float y)
    {
        return x>y?x:y;
    }

    static double max(double x, double y)
    {
        return x>y?x:y;
    }

    static int max(int x, int y, int z)
    {
        if (x>y && x>z)
            return x;
        else if (y>x && y>z)
            return y;
        else
            return z;
    }


    public static void main(String[] args){

        System.out.println(max(10, 5));
        System.out.println(max(10.5, 5.1));
        System.out.println(max(105458896, 5554554));
        System.out.println(max(10, 5));

    }
}