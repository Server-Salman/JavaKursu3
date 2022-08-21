package Gun16;

import java.util.Scanner;

public class _17_Odev {
    public static void main(String[] args) {
        //10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen
        // önce girilenden büyük ise döngü sonlansın.


        Scanner oku=new Scanner(System.in);

        int sonraki=0;
        for(int i=0;i<10;i++){

            System.out.print("Sayı giriniz=");
            int sayi=oku.nextInt();

            if (sonraki > sayi)
                 break;

            sonraki=sayi;
        }




    }
}
