package Gun30.Soru1;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.

    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.hesapID=1;
        mus1.ad="Hatice";
        mus1.soyad="Namlı";
        mus1.musteriHesap = new Hesap();

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("Extre = " + mus1.musteriHesap);

        // mus1.musteriHesap.bakiye ulasılamıyor, test i geçti


    }




}
