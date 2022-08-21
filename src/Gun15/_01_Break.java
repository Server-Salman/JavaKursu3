package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
         // Girilen bir sayının , 2 aynı sayının carpımına esıt olup olmadıgını bulunuz.
         // 16  4x4   ,   9 3x3,     6 böyle bir sayı değildir.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        // 16 girildiğinde 1 ....16 kadar sayılardan 1 si olabilir kendiyle çarpıldığında 16 veren

        int sayac=1;
        int arananSayi=0;
        while(sayac <= sayi){

            if (sayac*sayac == sayi){
                arananSayi=sayac;
                break;
            }

            sayac++;
        }

         if (arananSayi >0) // aranan sayıya bir deger atanmış mı? yani bulundu mu
             System.out.println("tam karedir, sayi  = " + arananSayi);
         else
             System.out.println("Bu sayı tam kare değildir.");

    }

}
