package Gun15;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        int toplam=0;
        for(int i=0;i<sayi;i++){
            toplam=toplam+i;    // toplam+=i;
        }

        System.out.println("toplam = " + toplam);
    }
}
