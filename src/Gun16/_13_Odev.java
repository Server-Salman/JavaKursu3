package Gun16;

import java.util.Scanner;

public class _13_Odev {
    public static void main(String[] args) {
        //6-Kullanıcnın gireceği bir sayının basamaklarına
        // göre tersi olan sayıyı bulunuz.

       // 1652 ->   2*10+5 => 25
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        int tersi=0;
        while (sayi>0){  // 165   16  1

            int basamak=sayi%10;   // 5   6   1
            tersi = tersi*10+basamak;  // tersi = 5      56    561
            sayi=sayi/10; // sayi= 16   1   0
        }

        System.out.println("tersi = " + tersi);

    }
}
