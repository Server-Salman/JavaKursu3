package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen  20 sayının toplamının sonucunu yazdırınız

        Scanner oku = new Scanner(System.in);
        int sayac=1;
        int toplam=0;

        while (sayac <=20)
        {
            System.out.print(sayac+".sayı giriniz =");
            int sayi=oku.nextInt();
            toplam = toplam +sayi;

            sayac++;
        }

        System.out.println("toplam = " + toplam);
    }
}
