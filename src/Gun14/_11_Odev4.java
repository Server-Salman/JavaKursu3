package Gun14;

import java.util.Scanner;

public class _11_Odev4 {
    public static void main(String[] args) {
        //kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        //bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline getirip, sonra yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("tamKismi =");
        String tamKismi= oku.next();

        System.out.print("ondalikKismi =");
        String ondalikKismi= oku.next();

        String strSayi= tamKismi.concat(".").concat(ondalikKismi);
        Double sayi= Double.parseDouble(strSayi);

        System.out.println("sayi = " + sayi);
    }
}
