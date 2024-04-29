import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sanyı gireceksiniz?");
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi < min) {
                min = sayi;

                if (sayi > max) {
                    max = sayi;

                    System.out.println("En küçük sayi:" + min);
                    System.out.println("En büyük sayi:" + max);


                    scanner.close();
                }
            }

        }
    }
}
