package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
        // girilen sayı dahil

        Scanner oku = new Scanner(System.in);
        System.out.print("Kaç kadar Sayılar toplanacak =");
        int sinir=oku.nextInt();

        int sayac=1;
        int toplam=0;

        while (sayac <= sinir){
            toplam= toplam + sayac;

            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
