import java.lang.*;
import java.util.List;
import java.util.Scanner;

class OldClass {
    public void Display() {
        System.out.println("Hello");
    }

    // As the method is depricated it means that this method is not suggested to prgrammers to use this
    @Deprecated
    public void Show() {
        System.out.println("hi");
    }
}

public class Demo4 {

    static List l;

    // Will stop giving warning related to Unchecked Exceptions
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        l.add(10);

    }
}
