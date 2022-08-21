package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        // Tarih içermez sadece saat,dak,san, nano san içerir

        LocalTime saat= LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        // kendimize özelformat oluşturma
        DateTimeFormatter ozelformat1= DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat = " + saat.format(ozelformat1));

        DateTimeFormatter ozelformat3= DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat = " + saat.format(ozelformat3));

        // Canlı saat
        DateTimeFormatter ozelformat2= DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true){
            saat= LocalTime.now();
            System.out.print("\rsaat = " + saat.format(ozelformat2));

            Thread.sleep(1000); // 1 sn bekleyecek
        }
        // ******************  //

    }
}
