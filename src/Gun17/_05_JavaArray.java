package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] dizi=new int[7];

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=0; i< dizi.length ; i++){
            System.out.print((i+1)+ ".Sayi giriniz=");
            dizi[i]=oku.nextInt();

            toplam=toplam+dizi[i];
        }

        int ort=toplam/dizi.length;
        System.out.println("ort = " + ort);

        int adet=0;
        for(int i=0; i< dizi.length ; i++) {

            if (dizi[i] > ort && dizi[i] % 2 == 1) {
                System.out.println(dizi[i]);
                adet++;
            }

        }

        System.out.println("adet = " + adet);
    }
}
