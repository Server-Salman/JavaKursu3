package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        try { // dene, hatanın başladığı yerin üstüne konur
            System.out.println("program başladı");
            LocalDate tarih = LocalDate.of(2018, Month.JUNE, 40);
            System.out.println("işlem tamam");
        }// hata olduğu zaman programı kırma
        catch(Exception hata)// hata isimli değişkende oluşan hataların bilgisi atanıyor
        {
            System.out.println("şu hata oldu="+hata.getMessage());
            // kendine mail att: gelen datatyı ve hatayı
            // Veritabanın kalıcı yer yaz
        }

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

        try {
            //java çalışmaya devam

        } // anlamadığın yer mi oldu ? kırılmadan devam
        catch (Exception hata)
        {
            // hatanın sebebını anla
            // gereken videoları tekrar izle
            // arkadaşlarına sonra mentöre sonra hocaya mutalak sor
            // öğren ve kırılmadn devma et
        }
        // Sonunda seni güzel bir meslek bekliyor
    }
}
