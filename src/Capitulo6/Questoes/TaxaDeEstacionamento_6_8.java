package Capitulo6.Questoes;

import java.util.Scanner;

public class TaxaDeEstacionamento_6_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas horas o carro ficou no estacionamento: ");
        int horas = sc.nextInt();

        calculaTaxa(horas);

    }

    public static void calculaTaxa(int horas){
        double valorAPagar = 2.0;

        if (horas < 24){
            if(horas > 3){
                for (int i = 3; i < horas; i++) {
                    valorAPagar += 0.5;
                }
                System.out.printf("O valor a pagar é: %.2f", valorAPagar);
            }else {
                System.out.printf("O valor a pagar é: %.2f", valorAPagar);
            }
        }

    }

}
