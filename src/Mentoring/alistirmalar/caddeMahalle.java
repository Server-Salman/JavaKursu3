package Mentoring.alistirmalar;

import java.util.Scanner;

public class caddeMahalle {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Cadde Ismi=");
        String cadde = oku.next();
        System.out.print("Sokak Ismi=");
        String sokak = oku.next();
        System.out.print("Posta kodu=");
        int Postakodu = oku.nextInt();
        System.out.print("Ulke=");
        String ulke = oku.next();

        System.out.println("Adress = "
                +"Cadde = " +cadde
                +" Sokak = " +sokak
                +" Posta Kodu = " +Postakodu
                +" Ulke = " + ulke);

    }
}
