package Cap4Excer;

import java.util.Scanner;

public class Exc4_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasTrabalhadas;
        double salarioHora;
        double salario = 0;
        int horasExtras;

        System.out.print("Qual o seu salário por hora trabalhada ou -1 para sair: ");
        salarioHora = sc.nextDouble();

        while (salarioHora != -1) {
            System.out.print("Quantas horas você trabalhou: ");
            horasTrabalhadas = sc.nextInt();

            if (horasTrabalhadas >= 40) {
                salario = salarioHora * 40;
                if (horasTrabalhadas > 40) {
                    horasExtras = horasTrabalhadas - 40;
                    salario += salarioHora * 0.5 * horasExtras;
                }
            }
            System.out.println("Seu salário é: " + salario);

            System.out.print("Qual o seu salário por hora trabalhada ou -1 para sair: ");
            salarioHora = sc.nextDouble();
        }

    }
}
