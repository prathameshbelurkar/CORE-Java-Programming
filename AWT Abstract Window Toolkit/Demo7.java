import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame {
    Label l1, l2;
    TextField tf;

    MyFrame() {
        super("TextField Demo");
        l1 = new Label("No Text is Entered Yet");
        l2 = new Label("Enter Key is not hit yet");
        tf = new TextField(20);
        tf.setEchoChar('*');


        Handler h = new Handler();

        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
    }



    class Handler implements TextListener, ActionListener {

        @Override
        public void textValueChanged(TextEvent te) {
            l1.setText(tf.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
