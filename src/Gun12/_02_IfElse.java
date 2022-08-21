package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        if (sayi>0){
            System.out.println("pozitif");
            System.out.println("pozitif");  // eğer birden fazla satır var ise parantez şart
        }
        else // yukarıdaki şart sağlanmazsa kaç ihtimal geriye kalıyor
        {
            if (sayi<0)
            {
                System.out.println("negatif");
            }
            else {
                System.out.println("sıfır");
            }
        }

    }
}
