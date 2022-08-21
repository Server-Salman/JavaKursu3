package Gun41.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    // Localtime ve LocalDatetime lar için kullanılır
    // bunların arasındaki farkları gosterir
    public static void main(String[] args) {
        // localTime
        LocalTime geceYarisi= LocalTime.of(0,0);
        LocalTime ogleVakti = LocalTime.of(13, 3, 2);

        Duration fark= Duration.between(geceYarisi, ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toHours());// farkın Toplam saat hali
        System.out.println("fark.toMinutes() = " + fark.toMinutes());// farkın toplam dakika halini
        System.out.println("fark.toMillis() = " + fark.toMillis());// farkın toplam milisaniye halini

//        System.out.println("fark.toDaysPart() = " + fark.toDaysPart()); // farkın sadece days parçasını verir
//        System.out.println("fark.toHoursPart() = " + fark.toHoursPart()); // farkın sadece saat parçasını verir
//        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());
//        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());
//        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());

        // LocalDateTime   *** 2 zaman farkı  ***
        LocalDateTime from= LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime to= LocalDateTime.of(2020,11,15,11,21,56);

        Duration farkZaman= Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());  // farkın toplam gunu
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours()); // farkın toplam saati
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes()); // farkın toplam dakikası
        System.out.println("farkZaman.toMillis() = " + farkZaman.toMillis()); // farkın toplam milisaniyesi

    }
}
