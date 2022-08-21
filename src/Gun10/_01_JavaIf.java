package Gun10;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //Baklava Dilimi = if
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.
        // Algoritma
        // 1- Basla
        // 2- Sayı oku
        // 3- sayi > 10 ise {10 dan büyük yaz}
        // 4- Dur
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        if (sayi > 10)
        { // evet çıkışı
            System.out.println("10 dan büyük");
        }
    }
}
