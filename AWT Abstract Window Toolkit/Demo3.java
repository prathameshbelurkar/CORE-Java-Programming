import java.lang.*;
import java.awt.*;


public class Demo3 extends Frame{
    Label l;
    TextField tf;
    Button b;

    public Demo3() {
        super("My App");
        setLayout(new FlowLayout());

        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Ok");

        add(l);
        add(tf);
        add(b);
    }

    public static void main(String[] args) {
        Demo3 f = new Demo3();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
