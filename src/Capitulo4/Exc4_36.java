package Capitulo4;

import java.util.Scanner;

public class Exc4_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valor2, valor3;

        System.out.print("Insira um valor: ");
        valor = sc.nextInt();
        System.out.print("Insira o segundo valor: ");
        valor2 = sc.nextInt();
        System.out.print("Insira o terceiro valor: ");
        valor3 = sc.nextInt();
        if (valor != 0 && valor2 != 0 && valor3 != 0) {
            if (valor != valor2) {
                if (valor != valor3) {
                    if (valor2 != valor3) {
                        System.out.println("Os valores podem representar um triângulo direito.");
                    }
                }
            }
        }
    }
}
