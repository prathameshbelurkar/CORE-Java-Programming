import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    MyFrame() {
        super("Swing Demo");

        setLayout(new FlowLayout());
        l = new JLabel("Clicked " + count + " Times");
        b = new JButton("Click");

        add(l);
        add(b);

        b.addActionListener(this);

        getRootPane().setDefaultButton(b);
        l.setToolTipText("Counter");
        // b.setIcon(new ImageIcon("path"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " Times");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}