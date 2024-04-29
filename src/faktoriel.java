import java.util.Scanner;

public class faktoriel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n = scan.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = scan.nextInt();

        int nFactoriyel = 1;
        int rFactoriyel = 1;
        int tFactoriyel = 1;

        for (int i = 1; i <= n; i++) {
            nFactoriyel *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFactoriyel *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            tFactoriyel *= i;
        }

        int total = nFactoriyel / (rFactoriyel * tFactoriyel);

        System.out.println("total: " + total);


    }
}

