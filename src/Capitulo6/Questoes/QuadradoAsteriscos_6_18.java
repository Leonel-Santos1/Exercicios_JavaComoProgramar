package Capitulo6.Questoes;

import java.util.Scanner;

public class QuadradoAsteriscos_6_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho do quadrado: ");
        int size = sc.nextInt();

        squareOfAsterisks(size);

    }

    public static void squareOfAsterisks(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
                if (j == size - 1)
                    System.out.println();
            }
        }
    }

}
