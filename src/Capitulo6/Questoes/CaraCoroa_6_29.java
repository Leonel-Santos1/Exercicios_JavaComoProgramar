package Capitulo6.Questoes;

import java.security.SecureRandom;
import java.util.Scanner;

public class CaraCoroa_6_29 {

//    Escreva um aplicativo que simula o jogo de cara ou coroa. Deixe o programa lançar uma moeda toda vez que o usuário
//    escolher a opção "Toss Coin" no menu. Conte o número de vezes que cada lado da moeda aparece. Exiba os resultados. O programa
//    deve chamar um método flip separado que não aceita argumentos e retorna um valor a partir de um Coin enum (HEADS e TAILS).
//    [Observação: se o programa simular de modo realista o arremesso de moeda, cada lado da moeda deve aparecer aproximadamente metade
//    das vezes.]

    private static final SecureRandom random = new SecureRandom();
    private enum Coin {HEAD, TAILS}

    public static void main(String[] args) {

        int opcao;
        Scanner sc = new Scanner(System.in);
        int frequenciaCoroas = 0;
        int frequenciaCaras = 0;
        Coin status;

        do {
            System.out.println("Toss Coin - 1");
            System.out.println("Sair - 0");
            System.out.print("Digite a opção:");
            opcao = sc.nextInt();

            if (opcao == 1) {
                status = flip();

                if (status == Coin.HEAD) {
                    frequenciaCoroas++;
                } else if (status == Coin.TAILS) {
                    frequenciaCaras++;
                }
            }
            System.out.println();
        } while (opcao != 0);

        System.out.println("Frequencia de coroa: " + frequenciaCoroas);
        System.out.println("Frequencia de caras: " + frequenciaCaras);

    }

    private static Coin flip() {

        int numero = random.nextInt(2) + 1;

        if (numero == 1)
            return Coin.HEAD;
        else return Coin.TAILS;

    }


}
