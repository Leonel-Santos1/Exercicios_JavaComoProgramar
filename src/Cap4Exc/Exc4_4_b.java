package Cap4Exc;

import java.util.Scanner;

public class Exc4_4_b {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Digite o valor do contador: ");
        int cont = sc.nextInt();

        if(cont > 10)
            System.out.println("Contador maior do que 10");
    }
}
