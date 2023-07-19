package Capitulo6.Questoes;

import java.security.SecureRandom;
import java.util.Scanner;

public class AdvinheNumero_6_30 {
    public static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        advinheNumero();
    }

    public static void advinheNumero() {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = random.nextInt(1000) + 1;
        int numeroEscolhido;

        do {
            System.out.print("Escolha um número entre 1 a 1000: ");
            numeroEscolhido = sc.nextInt();

//            System.out.println("Numero sercreto: "+ numeroSecreto);

            if (numeroSecreto - numeroEscolhido < 0)
                System.out.println("Muito alto. Tente novamente.");
            else if (numeroSecreto == numeroEscolhido)
                System.out.println("Parabéns, você adivinhou o número!");
            else
                System.out.println("Muito baixo. Tente novamente.");


        } while (numeroEscolhido != numeroSecreto);

    }

}
