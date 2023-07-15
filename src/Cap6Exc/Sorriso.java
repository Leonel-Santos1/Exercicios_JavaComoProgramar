package Cap6Exc;

import javax.swing.*;
import java.awt.*;

public class Sorriso {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);

    }
}

class DrawSmiley extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillOval(10, 10, 200, 200);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        g.fillOval(50, 110, 120, 60);

        g.setColor(Color.black);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
