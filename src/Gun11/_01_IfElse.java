package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu gırınız=");
        int ogrNot=oku.nextInt();

//        if (ogrNot >= 50){// hangi not girilirse girilsin burası herzaman kontorl edilir.
//            System.out.println("geçtiniz");
//        }
//
//        if (ogrNot < 50){
//            System.out.println("kaldınız");
//        }

        // Yukarıdaki iflerde herzaman kontrol edilme durumu vardır.
        // halbuki aşağıdaki IF-ELSE yapısında IF şartı çalıştığında ELSE
        // kontrol edilmesine gerek kalmaz.
        if (ogrNot >= 50){ // baklava dilimi
            System.out.println("geçtiniz"); // evet çıkışı
        }
        else{
            System.out.println("kaldınız"); //hayır çıkışı
        }
    }
}
