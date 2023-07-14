package Cap4Exc;

import java.util.Scanner;

public class Exc4_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valor2, valor3;

        System.out.print("Insira um valor: ");
        valor = sc.nextInt();
        System.out.print("Insira o segundo valor: ");
        valor2 = sc.nextInt();
        System.out.print("Insira o terceiro valor: ");
        valor3 = sc.nextInt();

        if(valor != 0){
            if (valor2 != 0){
                if (valor3 != 0){
                    System.out.println("Os valores digitados podem ser trinagulo.");
                }else
                    System.out.println("O terceiro valor é igual 0.");
            }else
                System.out.println("O segundo valor é igual 0.");
        }else
            System.out.println("O primeiro valor é igual 0.");

        
    }
}
