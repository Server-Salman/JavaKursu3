package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının sadece, birler basamağını yazı ile yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();

        int birler=sayi%10; // birler basamağını aldık.

        if (birler==0) { System.out.println("sıfır");}
        if (birler==1) { System.out.println("bir");}
        if (birler==2) { System.out.println("iki");}
        if (birler==3) { System.out.println("üç");}
        if (birler==4) { System.out.println("dört");}
        if (birler==5) { System.out.println("beş");}
        if (birler==6) { System.out.println("altı");}
        if (birler==7) { System.out.println("yedi");}
        if (birler==8) { System.out.println("sekiz");}
        if (birler==9) { System.out.println("dokuz");}
    }
}
