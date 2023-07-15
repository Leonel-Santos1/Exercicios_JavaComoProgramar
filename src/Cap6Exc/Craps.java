package Cap6Exc;

import java.security.SecureRandom;

public class Craps {

    public static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status{CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {

        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Os pontos são %d%n", myPoint);
            }
        }

        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint)
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN)
                    gameStatus = Status.LOST;
        }

        if(gameStatus == Status.WON)
            System.out.println("Jogador ganhou");
        else
            System.out.println("Jogador perdeu");

    }

    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Jogador rolou %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

}