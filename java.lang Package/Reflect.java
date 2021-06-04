import java.lang.*;
import java.lang.reflect.*;
import java.util.Scanner;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}

    public My(int x, int y) {}

    public void Display(String s1, String s2) {}
    public int Show(int x, int y) {return 0;}
}

public class Reflect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Main:");

        Class c = My.class; // Getting the Details of the class in c.
        My m = new My();
        Class c1 = m.getClass(); // Getting the Details of the class in c1.

        Field field[] = c.getDeclaredFields();
        Constructor cons[] = c.getConstructors();
        Method met[] = c.getMethods();

        // Will Display All the Attributes of a Class.
        // for (Field f: field)
        //     System.out.println(f);

        // Will Display All the Constructors of a Class.
        // for (Constructor ct: cons)
        //     System.out.println(ct);

        // Will Display All the Methods of a Class.
        // for (Method md:met)
        //     System.out.println(md);

        // Will Display the Parameters of a Method.
        // Parameter param[] = met[0].getParameters();
        // for (Parameter p:param)
        //     System.out.println(p);

        // System.out.println(c.getName());


    }
}
