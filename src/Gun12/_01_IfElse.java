package Gun12;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("2 Sayı yı bır bosluk bırakarak giriniz=");
        String sayilar=oku.nextLine(); // 45 24

        int boslukIndex=sayilar.indexOf(" ");

        String strSayi1= sayilar.substring(0, boslukIndex); //45 fakat string modda
        String strSayi2= sayilar.substring(boslukIndex+1); // 24 fakat string modda

        int sayi1= Integer.parseInt(strSayi1);
        int sayi2= Integer.parseInt(strSayi2);

        if (sayi1 == sayi2){
            System.out.println("Eşit");
        }
        else {
            System.out.println("Değil");
        }
    }
}
