package Mentoring._090522;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        //bir string ifadenin palindrome(tersten okununca da aynı) olup olmadığını kontrol eden bilgisayar programını Java dilinde yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir String Giriniz ");

        String girilen = sc.nextLine();

        // bunu çözmenin yolu
        // 1 = Döngü kullanmak
        // 2 = StringBuilder kullanmak

        String ters = new StringBuffer(girilen).reverse().toString();
        System.out.println(ters);

        boolean sonuz = ters.equalsIgnoreCase(girilen);
        System.out.println(sonuz);




    }
}
