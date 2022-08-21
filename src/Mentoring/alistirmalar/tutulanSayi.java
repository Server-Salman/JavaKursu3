package Mentoring.alistirmalar;

import java.util.Scanner;

public class tutulanSayi {
    public static void main(String[] args) {

        int tutulanSayi = (int) (Math.random()*30);
        Scanner sc = new Scanner(System.in);

        int sayac;
        // System.out.println("Tutulan Sayı = "+tutulanSayi);
        for (sayac = 0; sayac<=10 ; sayac++) {
            System.out.print("Lütfen Tahmininizi giriniz : ");
            int tahmin = sc.nextInt();
            if (tahmin==tutulanSayi){
                System.out.println("Tebrikler");
                break;
            }else if (tahmin>tutulanSayi){
                System.out.println("Küçült");
            }else if (tahmin<tutulanSayi){
                System.out.println("Büyült");
            }
            System.out.println("Kalan Hak = "+(10-sayac));
        }
        if (sayac>=10){
            System.out.println("Hakkınız Kalmadı");
        }
    }
}
