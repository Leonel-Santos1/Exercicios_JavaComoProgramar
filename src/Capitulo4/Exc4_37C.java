package Capitulo4;

import java.util.Scanner;

public class Exc4_37C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double e = 0;
        int numero = 1;
        double fatorial;
        int potencia;


        System.out.print("Digite quantos termos da constante e deseja calcular: ");
        int numeroDeTermos = sc.nextInt();
        System.out.print("Digite um valor para x: ");
        potencia = sc.nextInt();

        if (numeroDeTermos > 0) {
            int contador = 0;
            int contador2 = 0;

            while (contador < numeroDeTermos) {
                fatorial = numero;
                int contador3 = 1;

                while (contador3 < numero) {
                    potencia *= numero;
                    contador3++;
                }

                while (contador2 < numero) {
                    fatorial *= (numero - contador2);
                    contador2++;
                }

                if (contador == 0) {
                    e += 1 + potencia / fatorial;
                } else {
                    e += potencia / fatorial;
                }
                contador2 = 1;
                numero++;
                contador++;
            }
            System.out.println("O valor da Constante com os números de termos solicitados é: " + e);
        }


    }
}
