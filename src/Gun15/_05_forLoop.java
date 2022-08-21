package Gun15;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi=oku.nextInt();

        int carpim=1;
        for(int i=1;i<=sayi;i++)
            carpim=carpim*i;

        System.out.println("carpim = " + carpim);

    }
}
