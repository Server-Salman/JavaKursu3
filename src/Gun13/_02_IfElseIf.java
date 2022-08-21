package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.print("Toplama T\nÇıkartma Ç\nÇarpma P\nBölme B\n giriniz=");
        Scanner okuStr = new Scanner(System.in);
        String islem=okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam= = " + (sayi1+sayi2));
        else
            if (islem.equalsIgnoreCase("Ç"))
                System.out.println("çıkartma= = " + (sayi1-sayi2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("çarpma= = " + (sayi1*sayi2));
                else
                    if (islem.equalsIgnoreCase("B"))
                        System.out.println("bölme= = " + (sayi1/sayi2));
                    else
                        System.out.println("Hatalı seçim");




    }
}
