package Capitulo4;

import java.util.Scanner;

public class Exc4_37 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int fatorial = numero;

        if (numero>0){
            System.out.print(numero);
            int contador = 1;
            while (contador < numero){
                System.out.printf(" x %d", (numero-contador));
                fatorial = fatorial * (numero - contador);
                contador++;
            }
            System.out.println(" = "+fatorial);
        }
    }
}
