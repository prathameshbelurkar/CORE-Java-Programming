import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame {
    int x=0, y=0;
    MyFrame() {
        super("Painting");

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });

    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Noteworthy", Font.BOLD, 30));
        g.drawString("Hello", x, y);
    }

}

public class Demo16 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();

        f.setSize(500, 500);
        f.setVisible(true);
    }
}