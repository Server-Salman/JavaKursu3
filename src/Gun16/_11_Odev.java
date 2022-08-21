package Gun16;

import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
       // 5. Sayı bulmaca oyununu tam hali ile çözünüz. bu soruya baka bilirmiyiz

        Scanner oku=new Scanner(System.in);
        int tutulanSayi= (int)(Math.random()*10);
        int tahmin=0;
        int tahminSayisi=0;
        do{
            System.out.print("Sayi giriniz=");
            tahmin=oku.nextInt();

            if (tahmin < tutulanSayi)
                System.out.println("Büyük sayı giriniz.");

            if (tahmin > tutulanSayi)
                System.out.println("Küçük sayı giriniz.");

            if (tahmin==tutulanSayi) {
                System.out.println("tebrikler");
                break;
            }

            if (tahminSayisi == 10) {
                System.out.println("Tahmin etme hakkınız doldu");
                break;
            }

            tahminSayisi++;
        }while(tutulanSayi != tahmin);



    }
}
