package Mentoring.alistirmalar;

import java.util.Scanner;

public class MethodDeneme {
    public static void main(String[] args) {
        // Kullanıcıdan öğrenci adı ve notlarınız (60 70 90 ... ) şeklinde
        // 3 öğrenci ve 3 ders notu alınız bunların otalamasını
        // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
        // yazdırınız main içerisinde

        notAl();

    }
    private static void notAl() {
        Scanner sc = new Scanner(System.in);
        String isim;
        String notlar;
        for (int i = 0; i <3; i++) {
            System.out.print((i+1)+" Ögrencinin ismini Giriniz : ");
            isim = sc.nextLine();
            System.out.println((i+1)+" Ögrencinin Notlarını Giriniz : ");
            notlar = sc.nextLine();

            System.out.println("ortalama = " + ogrencIsleri(isim,notlar));
        }
    }
    private static String ogrencIsleri(String isim, String notlar) {
        String [] nots = notlar.split(" ");
        int ortalama =  muhasabe(nots);
        return isim + " Ortalaması = " +ortalama;
    }
    private static int muhasabe(String[] nots) {
        int toplam=0;
        for (int i = 0; i < nots.length ; i++) {
            toplam+=Integer.parseInt(nots[i]);
        }
        return toplam/nots.length;
    }
}
