package Gun31.FinalModifier.Ornek2;

import java.util.Scanner;

public class Ornek {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {
        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("Gun=");gun=oku.nextInt();
        System.out.print("Saat=");saat=oku.nextInt();
        System.out.print("Dakika=");dak=oku.nextInt();

        //1.Yöntem
        int toplamSaniye=
                gun * Sabitler.birGundekiSaatSayisi * Sabitler.birDakikadakiSanSayisi
                                                    * Sabitler.birSaatdekiDakSayisi +
                saat * Sabitler.birSaatdekiDakSayisi * Sabitler.birDakikadakiSanSayisi +

                dak * Sabitler.birDakikadakiSanSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.Yöntem
        System.out.println("toplamSaniye = " + Sabitler.hesapla(gun,saat,dak));
    }




}
