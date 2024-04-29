public class asalSayilar {
    public static void main(String[]args) {

        System.out.print("1 ile 100 arasındaki asal sayılar: ");

        // 1 ile 100 arasındaki her bir sayıyı kontrol et
        for(int i=2; i<=100; i++){
            boolean asalMi = true;


        // 2'den başlayarak sayıyı kendisine kadar olan her bir sayıya böl
        for(int j=2; j<=Math.sqrt(i); j++){

            //Eğer bölen bulunursa asal değildir
            if (i% j == 0) {
                asalMi = false;
                break;

                // Eğer asalsa ekrana yazdır
            }else if ( asalMi ) {
                System.out.print(" "+i );
            }

        }
        }

    }
}
