package Capitulo6.Questoes;

import java.security.SecureRandom;
import java.util.Scanner;

public class AdivinheNumeroModificado_6_31 {
    public static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        advinheNumero();
    }

    public static void advinheNumero() {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = random.nextInt(1000) + 1;
        int numeroEscolhido;
        int contagemAdivinhacoes = 0;

        do {
            System.out.print("Escolha um número entre 1 e 1000: ");
            numeroEscolhido = sc.nextInt();
            contagemAdivinhacoes++;

            if (numeroSecreto - numeroEscolhido < 0) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (numeroSecreto == numeroEscolhido) {
                System.out.println("Parabéns, você adivinhou o número!");

                if (contagemAdivinhacoes < 10) {
                    System.out.println("Você sabe o segredo ou teve muita sorte!");
                } else if (contagemAdivinhacoes == 10) {
                    System.out.println("Aha! Você sabe o segredo!");
                } else {
                    System.out.println("Você deve ser capaz de fazer melhor!");
                }
            } else {
                System.out.println("Muito baixo. Tente novamente.");
            }
        } while (numeroEscolhido != numeroSecreto);
    }
}
