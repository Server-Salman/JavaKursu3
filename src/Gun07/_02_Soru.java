package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadın adını ve soyadını ayırıp, ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve soyadınız = ");
        String adSoyad= oku.nextLine();

        // ismet temur  bosluğun indexini bulup substringle alabiliriz.
        int boslukIndex=adSoyad.indexOf(" ");
        String ad= adSoyad.substring(0,boslukIndex);
        String soyad= adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
