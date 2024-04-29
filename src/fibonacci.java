import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısı giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int fib1 = 0, fib2 =1;

        System.out.println("Fibonacci serisi:");
        System.out.print(fib1 + " "+fib2+ " ");

        for(int i=2; i<elemanSayisi; i++) {
            int yeniFib = fib1 + fib2;
            System.out.print(yeniFib + " ");

            fib1 = fib2;
            fib2 = yeniFib;

        scanner.close();
        }
    }
}
