package Odevler;

import java.util.Scanner;

public class Metod {
    public static void main(String[] args) {


        int enb=enbBul(4,5);  // giden 4,5 dönen 5
        System.out.println("enb = " + enb);

//        Scanner oxu=new Scanner(System.in);
//        System.out.print("Bir kelime girin : ");
//        String cumleUzunluqu= oxu.nextLine();
//        System.out.println("cumleUzunluqu = " + cumleUzunluqu);
//        int cumle= oxu.nextInt();
//
//        System.out.println("cumle = " + cumle);

    }
//    public static String cumleUzunluqu() {
//        String oxu = "";
//        String cumle = cumleUzunluqu();
//        for (int i = 0; i < cumle.length(); i++) {
//            cumle.indexOf();
//
//        }
//
//
//        return cumleUzunluqu();
//    }


    public static int enbBul(int s1, int s2) {
        int enb = s1;
        if (s2 > s1)
            enb = s2;

        return enb;
    }
}
