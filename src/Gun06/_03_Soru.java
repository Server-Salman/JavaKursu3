package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son Harfini yazdırınız.
        //   Merhaba  -> length : 7
        //   0123456
        // yani Length -1 i bana son harfin index ini verir

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string deger giriniz=");
        String girilen= oku.nextLine();

        int uzunluk= girilen.length();
        char sonHarf= girilen.charAt(uzunluk-1); // Toplam karakter sayısı okundu.
        // Fakat charAt indexe göre çalıştığından 1 eksiği alındı.

        System.out.println("sonHarf = " + sonHarf);
        System.out.println("sonHarf = " + girilen.charAt(girilen.length()-1));
    }
}
