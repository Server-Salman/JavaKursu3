package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("String giriniz=");
        String sifre=oku.nextLine();

        //sifre.contains("pass") // içinde sifre kelimesi var mı, sonucu geciyorsa true gecmiyorsa false
        //sifre.contains("pass") == false  ile !sifre.contains("pass")  geçiyor DEĞİLSE

        if (sifre.length() >= 8 && sifre.length() <=12 && sifre.contains("pass") == false){
            System.out.println("uygun");
        }
        else {
            System.out.println("degil");
        }
    }
}
