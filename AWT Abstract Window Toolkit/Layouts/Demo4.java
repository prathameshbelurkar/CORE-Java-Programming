import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame() {
        super("GridBagLayoutDemo");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gb);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(b1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(b2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        add(b3, gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        add(b4, gbc);

        gbc.gridx = 5;
        gbc.gridy = 5;
        add(b5, gbc);

        gbc.gridx = 6;
        gbc.gridy = 6;
        add(b6, gbc);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();

        f.setSize(500, 500);
        f.setVisible(true);
    }
}