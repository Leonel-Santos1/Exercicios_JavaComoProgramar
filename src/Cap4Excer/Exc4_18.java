package Cap4Excer;

import java.util.Scanner;

public class Exc4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDaConta;
        int saldoInicialMes;
        int totalDeItensCobrados;
        int totalDeCreditoAplicado;
        int limiteDeCredito;
        int novoSaldo;

        System.out.print("Digite o numero da Conta: ");
        numeroDaConta = sc.nextInt();
        System.out.print("Qual o seu saldo inicial do mês: ");
        saldoInicialMes = sc.nextInt();
        System.out.print("Qual o total de itens cobrados: ");
        totalDeItensCobrados = sc.nextInt();
        System.out.print("Qual o total de crédito aplicado: ");
        totalDeCreditoAplicado = sc.nextInt();
        System.out.print("Qual o seu limite de credito: ");
        limiteDeCredito = sc.nextInt();

        novoSaldo = saldoInicialMes + totalDeItensCobrados - totalDeCreditoAplicado;

        System.out.printf("Cliente de conta: %d%n", numeroDaConta);

        if (novoSaldo > limiteDeCredito){
            System.out.println("Limite de crédito excedido");
            System.out.println("Consulta finalizada");
        }else {
            System.out.println("Limite não excedido.");
            System.out.println("Consulta finalizada.");
        }

    }
}
