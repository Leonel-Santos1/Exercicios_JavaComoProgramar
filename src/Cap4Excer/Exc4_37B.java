package Cap4Excer;

import java.util.Scanner;

public class Exc4_37B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double e = 0;
        int numero = 1;
        double fatorial;

        System.out.print("Digite quantos termos da constante e deseja calcular: ");
        int numeroDeTermos = sc.nextInt();

        if (numeroDeTermos > 0) {
            int contador = 0;
            int contador2 = 0;

            while (contador < numeroDeTermos) {
                fatorial = numero;
                while (contador2 < numero) {
                    fatorial = fatorial * (numero - contador2);
                    contador2++;
                }

                if (contador == 0)
                    e += 1 + 1 / fatorial;
                else
                    e += 1/fatorial;

                contador2 = 1;
                numero++;
                contador++;
            }
            System.out.println("O valor da Constante com os números de termos solicitados é: "+e);
        }
    }
}
