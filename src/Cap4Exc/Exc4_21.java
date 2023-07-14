package Cap4Exc;

import java.util.Scanner;

public class Exc4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int numero;
        int maior = 0;

        while (contador < 10) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (maior < numero) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("O maior número digitado foi: "+maior);

    }
}
