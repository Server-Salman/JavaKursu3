package Mentoring.alistirmalar;

import java.util.Scanner;

public class satisIslemleri {
    public static void main(String[] args) {
        // Satış fiyatı ve adedi girilen ürünlerin toplam fiyatını ekrana yazdıran algoritma ve akış diagramı

        int fiyat;
        int adet;
        int toplam;


        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Satış Fiyatını Giriniz : ");
        fiyat = sc.nextInt();
        System.out.print("Lütfen Satış Adedini Giriniz : ");
        adet = sc.nextInt();
        toplam = fiyat*adet;

        System.out.println("Toplam = "+toplam);


    }
}
