package Gun16;

import java.util.Scanner;

public class _12_Odev {
    public static void main(String[] args) {
        //5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının
        // eşit olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        int ilkBasamak=sayi%10;  // 165%10 -> 5     165/10-> 16
        int sonBasamak=0;

        while (sayi>9)
        {
            sayi=sayi/10;
        }

        sonBasamak=sayi;

        System.out.println("ilkBasamak = " + ilkBasamak);
        System.out.println("sonBasamak = " + sonBasamak);

        if (ilkBasamak == sonBasamak)
            System.out.println("Eşit");
        else
            System.out.println("Değil");
    }
}
