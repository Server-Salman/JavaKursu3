package Gun41;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece gun,ay,yıl bilgisi tutar

        LocalDate tarih= LocalDate.now();

        // JAVANIN genel tarih gösterimi (ingilizce)
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));

        // isimleri Locale göre gösteriyor
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // localdeki saati aldım Almanya ya göre gösterdim
        System.out.println("FULL locale.GEMRMANY= " +
                tarih.format(  DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));


        Locale[] kullanilabilirLokaller= Locale.getAvailableLocales();

        for(Locale l : kullanilabilirLokaller)
        {
           if (l.getDisplayCountry().toLowerCase().contains("ice"))
            System.out.println(l.getDisplayCountry() +" "+ l + " "+l.getDisplayLanguage());
        }

        // lokaldeki tarih bilgisi alındı ve IZLANDA ca ya göre gösterildi.
        Locale lokalIzlanda= new Locale("is","IS");
        System.out.println("FULL lokalIzlanda= " +
                tarih.format(  DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalIzlanda)));

        //istediğim formatta gösterim.
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy= " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2= DateTimeFormatter.ofPattern("dd.MM yy");
        System.out.println("tarih dd.MM yy= " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih dd.MM yy= " + tarih.format(ozelFormat3));

        // Kendimiz bir tarihi nası set edebiliriz, oluşturabiliriz  int sayi=5;
        LocalDate tarih1= LocalDate.of(2020, 6,1);
        LocalDate tarih2= LocalDate.of(2021, Month.DECEMBER, 6);

        System.out.println("tarih1 = " + tarih1.format(ozelFormat3));

    }

}
