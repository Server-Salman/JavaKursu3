package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Saati giriniz=");
        int saat=oku.nextInt();

        if (saat <= 3)
        {
            System.out.println("10 tl");
        }
        else { // burası zaten 3 den büyük se demek
            if (saat <= 5){
                System.out.println("15 TL");
            }
            else {
                System.out.println("20 TL");
            }
        }



    }
}
