package Capitulo6.Questoes;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModificacaoCraps_6_33 {
    public static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        double aposta;

        do {
            System.out.print("Insira o valor da aposta: ");
            aposta = sc.nextDouble();

            if (aposta <= saldo) {
                int myPoint = 0;
                Status gameStatus;

                int sumOfDice = rollDice();

                switch (sumOfDice) {
                    case SEVEN, YO_LEVEN -> {
                        gameStatus = Status.WON;
                        saldo += aposta;
                    }
                    case SNAKE_EYES, TREY, BOX_CARS -> {
                        gameStatus = Status.LOST;
                        saldo -= aposta;
                    }
                    default -> {
                        gameStatus = Status.CONTINUE;
                        myPoint = sumOfDice;
                        System.out.printf("Os pontos são %d%n", myPoint);
                    }
                }

                while (gameStatus == Status.CONTINUE) {
                    sumOfDice = rollDice();

                    if (sumOfDice == myPoint) {
                        gameStatus = Status.WON;
                        saldo += aposta;
                    } else if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                        saldo -= aposta;
                    }
                }

                if (gameStatus == Status.WON) {
                    System.out.println("Jogador ganhou");
                    conversa();
                }
                else {
                    System.out.println("Jogador perdeu.");
                    conversa();
                }

                System.out.println();

                if (saldo == 0)
                    System.out.println("Desculpe, mas você faliu!");

            } else
                System.out.println("Insira um valor válido!");

        } while (saldo != 0);
    }

    public static void conversa() {
        int numero = randomNumbers.nextInt(3);

        switch (numero) {
            case 0 -> System.out.println("Oh, parece que você vai quebrar, hein?");
            case 1 -> System.out.println("Ah, vamos lá, dê uma chance para sua sorte");
            case 2 ->
                    System.out.println("Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!");
        }

    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Jogador rolou %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}
