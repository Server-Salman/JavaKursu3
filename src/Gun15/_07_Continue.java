package Gun15;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for(int i=1;i<=5;i++)
        {
            System.out.print("Bir sayı giriniz = ");
            int sayi=oku.nextInt();

            if (sayi>6 && sayi<10) // 7,8,9
                continue; // çalıştığında sonraki adımları pas geçer ve döngü devam eder

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }
    }
}
