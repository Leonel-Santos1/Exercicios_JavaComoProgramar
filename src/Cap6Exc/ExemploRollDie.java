package Cap6Exc;

import java.security.SecureRandom;

public class ExemploRollDie {
    public static void main(String[] args) {

        SecureRandom secureRandom = new SecureRandom();

        int frequencia1 = 0;
        int frequencia2 = 0;
        int frequencia3 = 0;
        int frequencia4 = 0;
        int frequencia5 = 0;
        int frequencia6 = 0;

        for (int roll = 1; roll <= 6000000; roll++) {
            int face = 1 + secureRandom.nextInt(6);

            switch (face) {
                case 1 -> frequencia1++;
                case 2 -> frequencia2++;
                case 3 -> frequencia3++;
                case 4 -> frequencia4++;
                case 5 -> frequencia5++;
                case 6 -> frequencia6++;
            }

        }

        System.out.println("Face \t Frequência");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n", frequencia1, frequencia2,
                frequencia3, frequencia4, frequencia5, frequencia6);

    }
}
