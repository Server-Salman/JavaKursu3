package Gun14;

import java.util.Scanner;

public class _08_Odev1 {
    public static void main(String[] args) {
        //1.SORU: Girilen bir ay numarasına göre , ayın hem adını
        // hem de kaç gün olduğunu sayı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ay no =");
        int ayno= oku.nextInt();

        switch (ayno){
            case 1: System.out.println("Ocak 31"); break;
            case 2: System.out.println("Şubat 28"); break;
            case 3: System.out.println("Mart 31"); break;
            case 4: System.out.println("Nisan 30"); break;
            case 5: System.out.println("Mayıs 31"); break;
            case 6: System.out.println("Haziran 30"); break;
            case 7: System.out.println("Temmuz 31"); break;
            case 8: System.out.println("Ağustos 31"); break;
            case 9: System.out.println("Eylül 30"); break;
            case 10: System.out.println("Ekim 31"); break;
            case 11: System.out.println("Kasım 30"); break;
            case 12: System.out.println("Aealık 31"); break;
        }


    }
}
