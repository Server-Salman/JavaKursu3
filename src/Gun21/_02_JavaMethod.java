package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı = ");
        int sayi1 = oku.nextInt();
        System.out.print("2.Sayı = ");
        int sayi2 = oku.nextInt();

//        sayi1=sayiOku();
//        sayi2=sayiOku();

        int enb=enbBuyukBul(sayi1,sayi2);
        System.out.println("enb = " + enb);

        //_01_JavaMethod.enbBul(sayi1,sayi2); aynı paketin içinden fonksiyon çağırma
        //Gun20._06_JavaMethod.faktoryelYaz(sayi1); diğer paketten çağırma
    }

    public static int enbBuyukBul(int s1, int s2){
        if (s1>s2)
            return s1;
        else
            return s2;
    }

    public static int sayiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı = ");
        return oku.nextInt();
    }

}
