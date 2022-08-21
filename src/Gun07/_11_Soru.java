package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz
        // 01.02.20   bu strinde kaç tane nokta vardır
        // 01.2001

        Scanner oku= new Scanner(System.in);
        System.out.print("Lütfen bilgiyi giriniz = ");
        String girilen= oku.nextLine();

        System.out.println("girilen = " + girilen); //434.erer.343
        int uzunluk1= girilen.length();

        String noktasiz = girilen.replace(".","");//434erer343 noktalar yok edildi
        System.out.println("noktasiz = " + noktasiz);
        int uzunluk2= noktasiz.length();

        System.out.println("nokta sayısı = " + (uzunluk1-uzunluk2));
    }
}
