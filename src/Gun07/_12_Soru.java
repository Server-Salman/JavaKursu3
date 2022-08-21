package Gun07;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
         // 10.Soru:  Girilen 3 kelimelik ismi A.Y.T şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("3 kelimelik isim giriniz = ");
        String adAdSoyad = oku.nextLine();

        // Ahmet Yılmaz Temiz
        // A-> 0,  Y-> 1.Boşluk+1  , T-> lastIndex bosluk+1
        char ilkHarf= adAdSoyad.charAt(0);
        char ikinciHarf= adAdSoyad.charAt(  adAdSoyad.indexOf(" ") + 1  );
        char ucuncuHarf= adAdSoyad.charAt(  adAdSoyad.lastIndexOf(" ") + 1  );

        System.out.println("Kısa hali = " + ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);
    }
}
