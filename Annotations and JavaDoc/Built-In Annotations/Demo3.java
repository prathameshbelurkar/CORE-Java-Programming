import java.lang.*;
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

public class Main {
    // This will prevent giving warning to the user while using deprecated methods and unchecked exceptions
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        OldClass s = new OldClass();
        s.Show();

    }
}
