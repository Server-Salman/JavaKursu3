package Mentoring.alistirmalar;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMahallesi {

    public static void main(String[] args) {
        System.out.println(pideci("Beyaz Un","Az Yağlı Kıyma","Havyar"));
        System.out.println(pideci("Esmer Un","Tavuklu","Domatesli"));

       int harcamalarim = muhasebeci(15,30,54);
       int yeniHarcama = muhasebeci(25,35,76);
       int yeniHarcama2 = muhasebeci(27,35,76);
       int hata1 = muhasebeci(harcamalarim,yeniHarcama,yeniHarcama2);
       int hata2 = muhasebeci(harcamalarim,yeniHarcama,yeniHarcama2);
       int hata3 = muhasebeci(harcamalarim,yeniHarcama,yeniHarcama2);
       System.out.println("aylık giderim = " +muhasebeci(hata1,hata2,hata3));

        
        System.out.println(Arrays.toString(randomArrayDoldurucu()));

        String strSayi= strCevirici(35);
        System.out.println("strSayi = " + strSayi);
    }

    static String strCevirici(int i) {
        return String.valueOf(i);
    }


    public static int[] randomArrayDoldurucu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sana kaçlık aray lazım : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=(int)(Math.random()*100)+1;
        }
        return arr;
    }

    public static String pideci(String un, String harc, String ekstra){
        return un+harc+ekstra+ " lı kıymanız. Afiyet Olsun";
    }
    public static int muhasebeci(int harcama1,int harcama2,int harcama3){
        return harcama1+harcama2+harcama3;
    }

}
