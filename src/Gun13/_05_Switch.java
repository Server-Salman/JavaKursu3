package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.print("Toplam için T\nÇıkrma için Ç\nÇarpma için P\nBölme için B ye\n basınız.");
        Scanner oku2 = new Scanner(System.in);
        String islem = oku2.next(); // String tipinde okundu

        switch (islem.toUpperCase()){
            case "T" : System.out.println("toplam="+(sayi1+sayi2)); break;
            case "Ç" : System.out.println("Çıkartma="+(sayi1-sayi2)); break;
            case "P" : System.out.println("Çarpma="+(sayi1*sayi2)); break;
            case "B" : System.out.println("Bölme="+(sayi1/sayi2)); break;
            default : System.out.println("Hatalı giriş"); break;
        }
    }
}
