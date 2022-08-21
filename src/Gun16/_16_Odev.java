package Gun16;

import java.util.Scanner;

public class _16_Odev {
    public static void main(String[] args) {
        // 9-Girilen bir cümledeki kelimelerin baş
        // harflarini yazdırınız.(Regex kullanmayın)

        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle giriniz=");
        String cumle=oku.nextLine();

        System.out.print(cumle.charAt(0)); // ilk harf
        for(int i=0; i<cumle.length();i++)
        {
            if (cumle.charAt(i)==' ')
                System.out.print(cumle.charAt(i+1));
        }

    }
}
