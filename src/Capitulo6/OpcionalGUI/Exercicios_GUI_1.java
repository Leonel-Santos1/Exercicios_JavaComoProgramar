package Capitulo6.OpcionalGUI;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class Exercicios_GUI_1 {
    public static void main(String[] args) {

        Draw panel = new Draw();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);


    }
}

class Draw extends JPanel {
    static SecureRandom randomNumber = new SecureRandom();
    private static final Color COR1 = new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256));
    private static final Color COR2 = new Color(randomNumber.nextInt(256), randomNumber.nextInt(256), randomNumber.nextInt(256));

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int pontos = 10;
        int tamanhos  = 200;

        for (int i = 1; i <= 5; i++) {
            g.setColor(COR1);
            g.fillOval(pontos, pontos, tamanhos, tamanhos);

            g.setColor(COR2);
            g.fillOval(pontos += 20, pontos, tamanhos -= 40, tamanhos);

            pontos += 20;
            tamanhos -= 40;
        }

    }
}

