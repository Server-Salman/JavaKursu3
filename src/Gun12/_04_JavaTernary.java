package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        // Klasik yöntem
        if (sayi %2 == 1)
            System.out.println("tek");
        else
            System.out.println("çift");

        // tek satırda yazma yöntemi : Ternary
        String sonuc = (sayi %2 == 1) ? "tek" : "çift";
        System.out.println("sonuc = " + sonuc);
        // şart doğru ise il bölüm değilse son bolüm çalışır.
        System.out.println( ((sayi %2 == 1) ? "tek" : "çift") );

    }
}
