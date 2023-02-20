package Cap4Excer;

import java.util.Scanner;

public class Exc4_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.print("Digite o lado do quadrado: ");
        int lado = sc.nextInt();


        while (contador < lado) {
            System.out.print("*\t\t");
            ++contador;
        }
        System.out.println();
        contador = 0;

        while (contador < lado - 2) {
            System.out.print("\n*");


            int espacoEmBranco = 0;

            while (espacoEmBranco < lado-1) {
                System.out.print("\t\t");
                ++espacoEmBranco;
            }
            System.out.print("*\n");
            ++contador;

        }
        System.out.println();
        contador = 0;
        while (contador < lado) {
            System.out.print("*\t\t");
            ++contador;
        }

    }
}
