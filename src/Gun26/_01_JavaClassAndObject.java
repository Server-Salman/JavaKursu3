package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {

    // metodun yazılabildiği yer
    public static void main(String[] args) {
        // ana programın başladığı ve çalıştığı yer
        int sayi=5;
        Scanner oku=new Scanner(System.in);

        Araba benimArabam=new Araba(); // Araba tür , benimArabam obje
        benimArabam.renk="Kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2020;

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
    }
    // metodları yazılabildiği yer.
}

class Araba { // bu bölüme class diyoruz ve bu sekılde tanımlanıyor
    String renk;
    int yili;
    double motorHacmi;
}