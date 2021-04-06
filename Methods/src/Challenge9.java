import java.lang.*;

//__________________________CALCULATE DISCOUNT USING VARARGS___________________________
public class Challenge9 {

    static double discount(double ...P){
        double sum = 0;
        for (int i=0; i<P.length; i++){
            sum = sum + P[i];
        }
        if (sum < 500)
            return (sum - ((sum * 10)/100));
        else if (sum>500 && sum<1000)
            return (sum - ((sum * 15)/100));
        else if (sum > 1000)
            return (sum - ((sum * 25)/100));
        else
            return -1;

    }

    public static void main(String[] args){
        System.out.println("Total Price: "+discount(25,36,45,87,96,102));
    }
}