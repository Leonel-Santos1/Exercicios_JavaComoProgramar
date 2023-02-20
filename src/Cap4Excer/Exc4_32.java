package Cap4Excer;

public class Exc4_32 {
    public static void main(String[] args) {

        for (int k = 1; k <= 4; k++) {
            for (int i = 1; i <= 8; i++) {
                System.out.print("* ");
                if (i == 8) {
                    System.out.println();
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }

            }
        }
    }
}