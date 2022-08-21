package Tekrarlar;

import javax.swing.*;
import java.util.Scanner;

import static Gun21._02_JavaMethod.sayiOku;


public class _Tekrarliq {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.println("1.Sayi giriniz = ");
        int sayi1=oku.nextInt();
        System.out.println("2.Sayi giriniz = ");
        int sayi2=oku.nextInt();
        int enb=enbuyukbul(sayi1,sayi2);
        System.out.println(enb);
    }
    public static int enbuyukbul(int sayi1,int sayi2){
        if (sayi1>sayi2)
            return sayi1;
        else
            return sayi2;


    }




}
