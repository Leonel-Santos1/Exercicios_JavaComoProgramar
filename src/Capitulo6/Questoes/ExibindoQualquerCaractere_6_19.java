package Capitulo6.Questoes;

import java.util.Scanner;

public class ExibindoQualquerCaractere_6_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho do quadrado: ");
        int size = sc.nextInt();

        System.out.print("Qual caractere deseja exibir: ");
        char fillCharacter = sc.next().charAt(0);

        squareOfCharacter(size, fillCharacter);


    }


    public static void squareOfCharacter(int size, char fillCharacter) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(fillCharacter);
                if (j == size - 1)
                    System.out.println();
            }
        }
    }

}
