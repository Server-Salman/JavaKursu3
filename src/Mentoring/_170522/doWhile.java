package Mentoring._170522;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        // Do While döngüsünde asıl amaç contion'a bakmadan ne olursa olsu
        // minimum 1 defa çalışması gereken döngülerdir.
        //PascalCase
        //camelCase
        //snake_case

      // int i = 0;
      // do {
      //     System.out.println("i = "+i);
      //     i++;
      // }while (i<50);

        // Tahmin oyununu do ile tasarlayalım.

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Tahmin Edin : ");
        int sayi = 15;
        int tahmin;
        do {
            tahmin=sc.nextInt();
            if (sayi!=tahmin){
                System.out.println("Tekrar Deneyiniz");
            }else {
                System.out.println("tebrikler");
            }
        }while (sayi!=tahmin);
    }
}
