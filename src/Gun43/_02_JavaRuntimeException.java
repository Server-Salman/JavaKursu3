package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        for(int i=0; i< 10; i++) {
            Scanner oku = new Scanner(System.in);

            try {
                System.out.print("1.Sayıyı giriniz=");
                int sayi1 = oku.nextInt();

                System.out.print("2.Sayıyı giriniz=");
                int sayi2 = oku.nextInt();

                System.out.println("bolum = " + (sayi1 / sayi2));
            }
            catch (Exception hata)
            {
                System.out.println(hata.getMessage());
                i--;
            }
        }
    }
}
