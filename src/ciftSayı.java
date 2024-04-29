import java.util.Scanner;

public class ciftSayı {
    public static void main(String[]args){
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        k = inp.nextInt();

        System.out.println("3'e ve 4'e tam bölünen sayılar:");
        int toplam = 0;
        int sayac = 0;

        for(int i = 0; i<=k; i++) {
            if (i%3 == 0 && i%4 == 0) {
                System.out.println(i);
                toplam += i;
                sayac++;

        double ortalama = (double) toplam / sayac;
        System.out.println("Çıktıların aritmetik ortalaması:" +  ortalama);






            }
        }

    }
}
