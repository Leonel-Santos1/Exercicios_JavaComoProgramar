package Cap4Excer;

import java.util.Scanner;

public class Exc4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int numero;
        int primeiroMaior = 0;
        int segundoMaior = 0;

        while (contador < 5) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (primeiroMaior < numero)
                primeiroMaior = numero;

            if (primeiroMaior > numero)
                segundoMaior = numero;


            contador++;
        }

        System.out.println("O maior número digitado foi: " + primeiroMaior);
        System.out.println("O segundo maior número digitado foi: " + segundoMaior);
    }
}
