package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

public class _04_ZonedDateTime {
    // Başka Zaman bolgelerinin zaman dilimlerini alma

    public static void main(String[] args) {
        ZonedDateTime zdtLokal=ZonedDateTime.now();
        // su andaki bolgenin zaman verdi yani lokal zaman
        System.out.println("zdt = " + zdtLokal);


        //ZonedDateTime ztdIstanbul = ZonedDateTime.now(ZoneID);
        Set<String> zamanBolgeleri=ZoneId.getAvailableZoneIds();
        for(String z : zamanBolgeleri){
            if (z.toLowerCase().contains("lon"))
              System.out.println("z = " + z);
        }

        //Europe/London
        // Şimdi bu Stringden bir ZoneID olusturalım
        ZoneId zoneLON= ZoneId.of("Europe/London");
        ZonedDateTime zdtLON=ZonedDateTime.now(zoneLON);

        System.out.println("zdtLON = " + zdtLON);

        DateTimeFormatter gosterimSablonu=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdt formatlı = " + zdtLON.format(gosterimSablonu));

    }
}
