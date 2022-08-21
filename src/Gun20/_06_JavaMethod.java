package Gun20;

import java.util.Scanner;

public class _06_JavaMethod {
    // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
    // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */


    public static void main(String[] args) {
           Scanner oku=new Scanner(System.in);

           int secim=0;
           do{

               menuYaz();
               secim=oku.nextInt();
               if (secim < 6 && secim>0)
                     islemYap(secim);

           }while (secim < 6 && secim>0);
    }
    public static void menuYaz(){
        System.out.print(" " +
                " 1-toplama\n" +
                " 2-çıkarma\n" +
                " 3-çarpma\n" +
                " 4-bolme\n" +
                " 5-Faktöryel\n" +
                " 6-Çıkış\nSeciminiz=");
    }

    public static void islemYap(int secim) {
        Scanner oku = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;

        if (secim < 5) {
            //2 sayı al
            System.out.print("1.Sayı=");
            sayi1 = oku.nextInt();
            System.out.print("2.Sayı=");
            sayi2 = oku.nextInt();
        } else {
            // 1 sayı al
            System.out.print("Sayı=");
            sayi1 = oku.nextInt();
        }

        switch (secim) {
            case 1: toplamYaz(sayi1,sayi2); break;
            case 2: cikartmaYaz(sayi1,sayi2); break;
            case 3: carpimYaz(sayi1,sayi2); break;
            case 4: bolumYaz(sayi1,sayi2); break;
            case 5: faktoryelYaz(sayi1); break;
        }
    }

    public static void toplamYaz(int sayi1, int sayi2)
    {
        System.out.println(sayi1 + sayi2);
    }

    public static void cikartmaYaz(int sayi1, int sayi2)
    {
        System.out.println(sayi1 - sayi2);
    }

    public static void carpimYaz(int sayi1, int sayi2)
    {
        System.out.println(sayi1 * sayi2);
    }

    public static void bolumYaz(int sayi1, int sayi2)
    {
        System.out.println(sayi1 / sayi2);
    }

    public static void faktoryelYaz(int sayi1)
    {
        int carpim = 1;
        for (int i = 1; i <= sayi1; i++)
            carpim = carpim * i;
        System.out.println("carpim = " + carpim);
    }

}
