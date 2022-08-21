package Gun42.ZamanDıgerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        // bilgisinin time veya tarih değişkenine çevrilmesi.
        String strDate="25 01 2020"; // 25/01/2020

        // String değeri tarihe çevirmek için format belirledik.
        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formatı bu formata uygun olmalı.parse ile çevirdik.
        LocalDate tarih=LocalDate.parse(strDate, format);

        System.out.println("tarih = " + tarih.format(format));



    }
}
