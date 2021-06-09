import java.lang.*;
import java.util.Scanner;

class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }
    public T getData() {
        return obj;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");
        
        Data<String> d = new Data<>();
        d.setData("Hi");
        System.out.println(d.getData());

    }
}
