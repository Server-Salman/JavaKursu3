package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

       // 6 7 3 8 1 -> 25   25/5 -> ort=5     ortaladan büyük kaç eleman var 3

        int[] dizi=new int[5]; // test için 5 yaptık

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=0;i<dizi.length;i++){
            System.out.print((i+1)+".Sayı ginizi=");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];
        }

        int ortalama= toplam/dizi.length;
        System.out.println("ortalama = " + ortalama);

        int adet=0;
        for(int i=0;i<dizi.length;i++)
        {
            if (dizi[i]>= ortalama) {
                System.out.println(dizi[i]);
                adet++;
            }
        }

        System.out.println("Ortalamadan buyuk sayı miktarı = " + adet);
    }
}
