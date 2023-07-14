package Cap4Exc;

public class Exc4_4_d {
    public static void main(String[] args) {

        double q = 20;
        double divisor = 2;

        q %= divisor;
        System.out.println(q);
        q = q % divisor;
        System.out.println(q);

    }
}
