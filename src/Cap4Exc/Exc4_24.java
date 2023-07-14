package Cap4Exc;

import java.util.Scanner;

public class Exc4_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aprovados = 0;
        int reprovados = 0;
        int contador = 1;

        while (contador <= 10){
            System.out.print("Entre com resultado (1 = aprovado, 2 = reprovado): ");
            int result = sc.nextInt();

            if (result == 1){
                aprovados += 1;
                contador++;
            }
            else if (result == 2){
                reprovados += 1;
                contador++;
            }

        }

        System.out.printf("Aprovados: %d%nReprovados: %d%n", aprovados, reprovados);

        if (aprovados > 8)
            System.out.println("Bonus para o instrutor");

    }
}
