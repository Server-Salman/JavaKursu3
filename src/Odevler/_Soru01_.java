package Odevler;

import java.util.Scanner;

public class _Soru01_ {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int [] dizi=new int[10];
        int [] tekler=new int[10];

        for (int i = 0; i < dizi.length; i++) {
             dizi[i] = (int) (Math.random()*100);
        }
        int j=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1);
            tekler[j]=dizi[i];
        }





            
            




    }
}





