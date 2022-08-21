package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);// okuyucuyu bi kere tanımlamaız gerekiyor.

        System.out.print("Adınızı ve soyadınızı giriniz=");// ekrana gelen veri girişinin ne için olduğunu
        // kullanıcıya belirtmek için zorunlu değil.  LN yi sildik çünkü kursor yanında olsun

        String adSoyad=oku.nextLine();// okuma işi bu noktada yapılıyor. bizde okunan değeri değişkene eşitliyoruz

        System.out.println("adSoyad = " + adSoyad);// okunan değer doğru mu okundu diye ekrana yazdırıyoruz.
    }
}
