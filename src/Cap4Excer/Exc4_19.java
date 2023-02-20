package Cap4Excer;

import java.util.Scanner;

public class Exc4_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double item;
        int somaItens = 0;
        double salario = 200;

        System.out.print("Digite o item vendido ou -1 para sair: ");
        item = sc.nextDouble();
        while (item != -1){
            if (item == 1){
                salario = salario + 239.9 * 0.9;
            }
            else if (item == 2){
                salario = salario + 125.75;
            }
            else if (item == 3){
                salario = salario + 99.95 * 0.9;
            }
            else if (item == 4){
                salario = salario + 350.89 * 0.9;
            }
            System.out.printf("Seu salário é: %.2f%n",salario);

            System.out.print("Digite o item vendido ou -1 para sair: ");
            item = sc.nextDouble();

        }

    }
}
