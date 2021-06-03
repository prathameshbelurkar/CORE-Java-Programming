import java.lang.*;
import java.util.Scanner;

// myObject class automatically extending from the Object Class.
class myObject {
    @Override
    public String toString() {
        return "My Object";
    }

    @Override
    public int hashcode() {
        return 100;
    }
    /*
    @Override
    public boolean equals(Object o) {
        return this.hashcode() == o.hashCode();
    }
    */

    // We can't Override the wait() as it is Final method.
    // We can't Override the notify() as it is Final method.
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myObject o1 = new myObject();
        myObject o2 = new myObject();


        System.out.println(o1);

    }
}
