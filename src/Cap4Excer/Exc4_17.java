package Cap4Excer;

import java.util.Scanner;

public class Exc4_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int KmDirigidos;
        int litrosConsumidos;
        double totalLitros = 0;

        while (true) {

            System.out.print("Quilômetros percorridos na viagem | -1 para sair |: ");
            KmDirigidos = sc.nextInt();

            System.out.print("Litros consumidos na viagem | -1 para sair |: ");
            litrosConsumidos = sc.nextInt();

            if (KmDirigidos != -1 && litrosConsumidos != -1)
                System.out.printf("O consumo em Km/litros dessa viagem foi de: %.2f %n", (double) KmDirigidos/litrosConsumidos);

            System.out.println();

            if (KmDirigidos == -1 || litrosConsumidos == -1)
                break;

            totalLitros += litrosConsumidos;
        }

        System.out.println("A quantidade de litros consumidos em todas as viagens é de: "+totalLitros);

    }

}
