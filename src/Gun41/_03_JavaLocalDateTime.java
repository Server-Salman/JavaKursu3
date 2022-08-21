package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime  hem tarih hem de saat bilgisini tutar
        LocalDateTime dt= LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        //DateTime da sadece SHORT ve MEDIUM çalışabiliyor
        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        // aşağıdaki DATE formata aittir
        System.out.println("FULL = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        DateTimeFormatter ozelFomat=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt = " + dt.format(ozelFomat));

    }
}
