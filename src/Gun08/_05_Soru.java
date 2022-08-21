package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir kelime giriniz=");
        String kelime=oku.next();

        char ilkHarf= kelime.charAt(0);
        char sonHarf= kelime.charAt( kelime.length() -1 );  // Melike  -> length 6

        System.out.println("ilkHarf ve Sonharf = " + ilkHarf+" "+sonHarf);
    }
}
