import java.lang.*;
import java.util.Scanner;

enum Dept {
    CS("Smith", "Block A"), IT("John", "Block B"), CIVIL("Dave", "Block C"), ECE("Rock", "Block D");  // All these Constants are in Capitals.

    String head;
    String location;


    private Dept(String head, String loc) {
        this.head = head;
        this.location = loc;
    }

    public String getheadName() {
        return head;
    }

    public String getLocation() {
        return location;
    }

}

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Dept d = Dept.CS;
        System.out.println(d.getheadName());
        System.out.println(d.getLocation());

    }
}
