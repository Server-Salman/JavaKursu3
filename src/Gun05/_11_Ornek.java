package Gun05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde=");
        String cadde=oku.nextLine();

        System.out.print("Sokak=");
        String sokak=oku.nextLine();

        Scanner oku2=new Scanner(System.in);
        System.out.print("Posta Kodu=");
        int postaKodu=oku2.nextInt();

        System.out.print("Ulke=");
        String ulke=oku.nextLine();

    }
}
