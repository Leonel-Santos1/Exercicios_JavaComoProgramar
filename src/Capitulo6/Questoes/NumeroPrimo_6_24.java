package Capitulo6.Questoes;

import java.util.Scanner;

public class NumeroPrimo_6_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        numeroPrimo(numero);

        intervalosPrimos(10000);

    }


    public static void numeroPrimo(int numero) {
        int totalDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                totalDivisores++;
            }
        }

    }


    public static void intervalosPrimos(int intervalo) {
        int totalDivisores = 0;

        for (int i = 1; i <= intervalo; i++) {

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    totalDivisores++;
                }

            }
            if (totalDivisores == 2) {
                System.out.println("Primo: " + i);
            }
            totalDivisores = 0;

        }
    }

}
