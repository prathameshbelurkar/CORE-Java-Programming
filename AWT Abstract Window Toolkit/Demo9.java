import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements ItemListener, ActionListener{
    Choice c;
    TextArea ta;
    List l;

    MyFrame() {
        super("ListBox Demo");
        l = new List(4, true);
        ta = new TextArea(20, 30);
        c = new Choice();

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String list[] = l.getSelectedItems();
        String txt = "";

        for (String x:list)
            txt += x + "\n";

        ta.setText(txt);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();

        f.setSize(500, 500);
        f.setVisible(true);
    }
}
