package Cap4Excer;

import java.util.Scanner;

public class Exc4_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, contador2 = 1;
        long numero, copiaNumero, copiaNumero2, resto, numeroBinario = 0;
        int quantidadeNumeros = 0;
        int valorPosicional = 1;
        boolean valorLogico = false;

        while (contador != -1) {

            System.out.print("Digite um número em binário. 0 e 1: ");
            numero = sc.nextLong();
            copiaNumero = numero;
            copiaNumero2 = numero;

            while (numero != 0) {
                resto = numero % 10;
                numero = numero / 10;
                if (resto != 1 && resto != 0) {
                    System.out.println("Número inserido não é binário. Insira outro valor.");
                    valorLogico = false;
                    break;
                }else {
                    valorLogico = true;
                }

            }

            if (valorLogico){
                while (copiaNumero != 0) {
                    copiaNumero = copiaNumero / 10;
                    quantidadeNumeros++;
                }
                while (contador2 <= quantidadeNumeros) {
                    resto = copiaNumero2 % 10;

                    copiaNumero2 = copiaNumero2 / 10;

                    numeroBinario += resto * valorPosicional;
                    valorPosicional *= 2;
                    contador2++;

                }
                System.out.println("O correspondente em decimal é: " + numeroBinario);
                contador = -1;
            }
        }

    }
}
