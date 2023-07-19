package Capitulo4;

public class Exc4_22 {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("N \t\t 10*N \t 100*N \t 1000*N");

        while (contador <= 5){
            System.out.println(contador + "\t\t " + contador * 10 + "\t\t " + contador * 100
            + "\t " + contador * 1000);
            contador++;
        }

    }
}
