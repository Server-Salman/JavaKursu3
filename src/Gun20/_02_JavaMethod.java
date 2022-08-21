package Gun20;

public class _02_JavaMethod {
    //buraya

    public static void main(String[] args) {  // ana kısım burada başlıyor BAŞLA

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        Math.max(4,5);// daha önce yazılmış biz çağırıp kullanıyoruz
        // aynı bunun gibi bizde böyle metodlar yazabiliriz.
        // mesala ekrana merhaba dünya yazan bir metod yazalım ve onu sürekli çağıralım.

        merhabaYaz(); // fonksiyonu çağırma şekli
        merhabaYaz();
        merhabaYaz();
    } // ANA kısım burada bitiyor DUR

    //ya da burada

    public static void merhabaYaz(){ // fonksiyon, metod denilebilir.
        System.out.println("fonksiyonda Merhaba Dünya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
