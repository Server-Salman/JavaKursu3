package Gun26._02_Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.

        ArrayList<Ogrenci> snf=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for(int i=1 ; i<=3 ;i++) {

            Ogrenci ogr = new Ogrenci();
            System.out.print("Öğrenci Adı=");
            ogr.adi = oku.nextLine();
            System.out.print("Öğrenci Soyadı=");
            ogr.soyadi = oku.nextLine();
            System.out.print("Öğrenci Sınıfı=");
            ogr.sinifi = okuInt.nextInt();
            System.out.print("Öğrenci Adresi=");
            ogr.adres = oku.nextLine();

            snf.add(ogr);
        }

        for(Ogrenci ogr : snf)
        {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);
        }

    }
}

class Ogrenci{
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}
