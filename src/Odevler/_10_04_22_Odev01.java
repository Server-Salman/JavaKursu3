package Odevler;

import java.util.Scanner;

public class _10_04_22_Odev01 {
    public static void main(String[] args) {
        // 1- Girilen 1 sayının onlar basamağının tek olup olmadıüını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= oku.nextInt();

        int onlar=(sayi/10)%10;

        if (onlar%2==1) {
            System.out.println("tek = " + onlar);
        }



    }
}
