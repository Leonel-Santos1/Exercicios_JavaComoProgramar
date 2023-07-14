package Cap4Exc;

import java.util.Scanner;

public class Exc4_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int numero;
        String palindromo = "";

        while (contador != -1) {
            System.out.print("Digite 5 números: ");
            numero = sc.nextInt();
            int copiaNumero = numero;

            if (numero >= 9999 && numero <= 99999) {
                int resultado;

                while (numero > 0){
                    resultado = numero % 10;
                    palindromo += String.valueOf(resultado);
                    numero = numero / 10;
                }
//                String palindromo = primeiraString + segundaString + terceiraString + quartaString + quintaString;

                if (Integer.parseInt(palindromo) == copiaNumero)
                    System.out.println("É um palíndromo!!! Aeee");
                else
                    System.out.println("Não é palíndromo retardado.");
                contador = -1;
            } else
                System.out.println("Insira outro valor!");
        }

    }
}