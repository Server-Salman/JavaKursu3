package Mentoring._100522;

import java.util.Scanner;

public class Basıc_If_Statement {
    public static void main(String[] args) {

        /**
         *      Daha önce Algoritma'da gördüğümüz "<>" Baklava Dilimine Denk gelen java terimi.
         *
         *              En Temel "if" yapısı aşağıdaki gibidir.
         *
         *              if (condition) {  // condition = Şart
         *                // statements   // Şart kısmının true olması sonucunda çalışacak olan kod bloğu
         *              }
         *
         */

        /************ // checks if number is less than 0 // ******************/

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Bir Numara Giriniz : ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("The number is negative.");
        }

        System.out.println("Statement outside if block");

        // Output = Statement outside if block

    }
}
