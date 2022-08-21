package Mentoring._100522;

import java.util.Scanner;

public class If_Negative {
    public static void main(String[] args) {
        // // Haftanın günlerini alarak o günün tatil mi iş günü mü olduğunu bulunuz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen Gün Giriniz : ");
        String gun = sc.nextLine();
        gun = gun.trim();

        boolean sart = gun.equalsIgnoreCase("Pazar");
        boolean sart2 = gun.equalsIgnoreCase("Cumartesi");

        if (sart){
            System.out.println("Yaşasın Tatil");
        }
        if (sart2){
            System.out.println("Yaşasın Tatil");
        }

        // "!="
        /***
         *           if (!condition) {   condition'un karşılanmadığı durumlarda çalışan kod bloğu
         *             // statements
         *           }
         */

    }
}
