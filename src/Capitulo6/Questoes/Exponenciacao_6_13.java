package Capitulo6.Questoes;
import java.util.Scanner;

public class Exponenciacao_6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite o expoente que deseja elevar: ");
        int expoente = sc.nextInt();

        if (numero != 0){
            int resultado = potenciaInteira(numero, expoente);
            System.out.printf("O valor de %d^%d é: %d", numero, expoente, resultado);
        }else {
            System.out.println("A base deve ser diferente de 0.");
        }

    }


    public static int potenciaInteira(int base, int expoente) {
        int copiaBase = base;

        for (int i = 1; i < expoente; i++) {
            base *= copiaBase;
        }

        return base;
    }

}
