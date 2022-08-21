package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        // toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Kaç kadar Sayılar toplanacak =");
        int sinir=oku.nextInt();

        int sayac=1;
        int toplam=0;

        while (sayac <= sinir){

              if (sayac%2 ==1 )
                 toplam=toplam+sayac;  // toplanacak sayıları sayac

            sayac++;
        }
        System.out.println("toplam = " + toplam);

        // 2.yol
        sayac=1;
        toplam=0;
        while (sayac <= sinir){
            toplam=toplam+sayac;  // toplanacak sayıları sayac
            sayac= sayac+2;
        }
        System.out.println("toplam = " + toplam);
    }
}
