package Mentoring._160522;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Günü Giriniz : ");
        String gun = sc.nextLine();

        switch (gun){
            case "sali":
                System.out.println("Haftanın 2. Günü");
                break;
            case "cuma":
                System.out.println("Mübarek Gün");
                break;

            default:
                System.out.println("Hocam Selamlar buradayız");

        }
    }
}
