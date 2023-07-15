package Cap6Exc;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;


public class Exercicios_GUI_2 {
    public static void main(String[] args) {
        Desenha panel = new Desenha();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);

    }

}


class Desenha extends JPanel {

    private static final int OVAL = 1;
    private static final int RECT = 2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        SecureRandom randomNumber = new SecureRandom();

        for (int i = 1; i <= 50; i++) {
            if ((1 + randomNumber.nextInt(2)) == OVAL) {
                g.setColor(new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256)));
                g.fillOval(randomNumber.nextInt(230), randomNumber.nextInt(250), randomNumber.nextInt(250/2), randomNumber.nextInt(250/2));
            } else if ((1 + randomNumber.nextInt(2)) == RECT) {
                g.setColor(new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256)));
                g.fillRect(randomNumber.nextInt(230), randomNumber.nextInt(250), randomNumber.nextInt(250/2), randomNumber.nextInt(250/2));
            }
        }


    }
}