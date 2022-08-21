package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi=oku.nextInt();

        System.out.println(" tek mi ? = " + (sayi%2 == 0));
    }
}
