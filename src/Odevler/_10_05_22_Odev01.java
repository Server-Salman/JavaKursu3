package _10_Odevler;

import java.util.Scanner;

public class _10_05_22_Odev01 {
    public static void main(String[] args) {
        //1- Girilen 3 sayıdan büyük olanı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi bir giriniz = ");
        int sayi1=oku.nextInt();
        System.out.print("Sayi iki giriniz = ");
        int sayi2=oku.nextInt();
        System.out.print("Sayi üc giriniz = ");
        int sayi3=oku.nextInt();

        int enbuyuksayi=0;

        if ( sayi1 >= sayi2 && sayi1 >= sayi3 && sayi2 >= sayi1 && sayi2 >= sayi1 && sayi2 >= sayi3 && sayi2 >= sayi3)
        {
            System.out.println("Enbuyuk = " + sayi1);
        }
        else {
            System.out.println("Enbuyuk = " + sayi3);
        }


        







    }
}
