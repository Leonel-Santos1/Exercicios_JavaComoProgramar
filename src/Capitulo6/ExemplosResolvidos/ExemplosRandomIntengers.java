package Capitulo6.ExemplosResolvidos;

import java.security.SecureRandom;

public class ExemplosRandomIntengers {

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 1; i <= 20; i++) {
            int face = 1 + secureRandom.nextInt(6);

            System.out.printf("%d  ", face);

            if(i % 5 == 0)
                System.out.println();

        }

    }

}
