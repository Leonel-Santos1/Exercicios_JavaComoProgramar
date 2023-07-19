package Capitulo6.Questoes;

import java.util.Scanner;

public class NumeroPerfeito_6_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        isPerfect(numero);

        intervaloPerfeitos(10000000);

    }


    public static void isPerfect(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            System.out.println("O número é perfeito. A soma é: " + somaDivisores);
        } else
            System.out.println("O número não é perfeito.");
    }

    public static void intervaloPerfeitos(int intervalo) {
        int somaDivisores = 0;

        for (int i = 2; i <= intervalo; i++) {

            for (int j = 1; j < intervalo; j++) {
                if (i % j == 0 && j != i) {
                    somaDivisores += j;
                }
            }

            if (somaDivisores == i){
                System.out.println("O número é perfeito. A soma é: " + somaDivisores);
                System.out.print("Seus divisores são:");
                for (int j = 1; j < i; j++) {
                    if (i % j == 0){
                        System.out.printf("%d%n", j);
                    }
                }
            }
            somaDivisores = 0;
        }

    }

}
