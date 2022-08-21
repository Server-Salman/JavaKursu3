package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Birinci Sayi=");
        int sayi1=oku.nextInt();

        System.out.print("İkinci Sayı=");
        int sayi2=oku.nextInt();

        //1.yöntem
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);

        //2.Yöntem
        System.out.println("toplam = " + (sayi1+sayi2));

        // string toplama olan durum
        System.out.println("toplam = " + sayi1+sayi2); // rakamları yan yana topladı
        // çünkü toplama işleminde bir string var ise diğerleri otomatik string olur
    }
}
