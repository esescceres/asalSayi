import java.util.Scanner;

public class armstrongSayılar {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber = tempNumber % 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            // 1*1*1*1=1^4
            basPow = 1;
            for (int i =1; i<= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber/= 10;
        }

        if (result == number) {
            System.out.println(number + "sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + "sayısı bir Armstrong sayısı değildir.");
        }
        int a = 1643, basamakSayisi =0, numberCounter =0;

        // Basamak Sayısı Bulma İşlemi
        // 1643/10 = 164
        // 163/10 = 16
        // 16/10 = 1
        // 1/10 = 0
        // 0/10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        //1643/10= 3
        int b = 1643;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result1 = 1;
        for (int i =1; i <= sup; i++ ){
                result1 *= sub;
        }
        System.out.println(result1);



        }


        }





