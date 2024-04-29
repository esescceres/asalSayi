import java.util.Scanner;

public class mukemmerlSayi {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for(int i=1; i <sayi; i++){
            if(sayi % i == 0){
                toplam += i;

        if(toplam == sayi) {
            System.out.println("Mükemmel sayıdır." + sayi);
        } else {
            System.out.println("Mükemmel sayı değildir." + sayi);
        }
        scanner.close();
        }
            }
        }
    }

