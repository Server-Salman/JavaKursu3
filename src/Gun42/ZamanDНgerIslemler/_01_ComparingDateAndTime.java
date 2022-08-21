package Gun42.ZamanDıgerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun= LocalDate.now();
        LocalDate dun= buGun.minusDays(1);

        // bugün dün den sonra mi
        boolean sonraMi= buGun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        // bugün dün den önce mi
        boolean onceMi= buGun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        // bugün dün e eşit mi
        boolean esitMi= buGun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        // bugün artık yıl mi
        boolean artikYilMi= buGun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);

        // 2 tarih arasında fark var ise farkın en büyük olduğu değeri verir
        int fark = buGun.compareTo(dun.minusDays(3));
        System.out.println("fark = " + fark);

    }
}
