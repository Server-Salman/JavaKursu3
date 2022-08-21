package Gun27._03_Ornek;

public class Ornek3 {
    public static void main(String[] args) {
        /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

        Musteri mus1=new Musteri();
        mus1.name="ismet";

        ElektrikHesabi hesap=new ElektrikHesabi();
        mus1.elektrikHesabi = hesap;

        mus1.elektrikHesabi.tuketimEkle(100);
        mus1.elektrikHesabi.tuketimEkle(200);
        mus1.elektrikHesabi.tuketimEkle(150);

        System.out.println("musteri = " + mus1.name);
        mus1.elektrikHesabi.toplamTuketimYaz();

        mus1.elektrikHesabi.odenecekTutar();




    }
}










//        //1.Yöntem
//        ElektrikHesabi eh=new ElektrikHesabi();
//        mus1.elektrikHesabi =eh;

////2.yöntem
//        mus1.elektrikHesabi = new ElektrikHesabi();