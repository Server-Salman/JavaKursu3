package Gun31.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım Ortaokulu";
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", Soyad='" + soyad + '\'' +
                ", OkulAd='" + okulAd + '\'' +
                '}';
    }
}
