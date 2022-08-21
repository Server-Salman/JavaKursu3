package Mentoring._100522;

import java.util.Scanner;

public class If_Contains_Equals {
    public static void main(String[] args) {
        // Haftanın günlerini alarak o günün tatil mi iş günü mü olduğunu bulunuz.
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Günü Giriniz : ");
        String gun = sc.nextLine();
        gun = gun.trim();

        if (gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Çalışmaya Devam");
        }
        if (gun.equalsIgnoreCase("Salı")){
            System.out.println("Çalışmaya Devam");
        }
        if (gun.equalsIgnoreCase("Çarşamba")){
            System.out.println("Çalışmaya Devam");
        }
        if (gun.equalsIgnoreCase("Perşembe")){
            System.out.println("Çalışmaya Devam");
        }
        if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Çalışmaya Devam");
        }
        if (gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yaşasın Tatil");
        }
        if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Yaşasın Tatil");
        }




    }
}
