package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        ArrayList<Integer> notlar=new ArrayList<>();

        String devamMi="";
        int toplam=0;
        do{
            System.out.print("Not=");
            int ogrNot=okuInt.nextInt();
            notlar.add(ogrNot);
            toplam+=ogrNot;

            System.out.print("Devam Etmek istiyor musunuz (E/H) ");
            devamMi=oku.next();

        }while( devamMi.equalsIgnoreCase("E"));

        System.out.println("notlar = " + notlar);  // kontrol
        int ort=toplam / notlar.size();
        System.out.println("ort = " + ort);

        gecenSayisiYaz(notlar,ort);  // dönen değere gerek olmadan çözüm
        int gecenSayisi = gecenSayisiBul(notlar,ort);  // donen degerli çözüm
    }


    public static void gecenSayisiYaz(ArrayList<Integer> diziList, int ort)
    {
        int gecenSayisi=0;
        for(int i=0;i< diziList.size() ; i++)
            if (diziList.get(i) >= ort)
                gecenSayisi++;

        System.out.println("gecenSayisi = " + gecenSayisi);
    }

    public static int gecenSayisiBul(ArrayList<Integer> diziList, int ort)
    {
        int gecenSayisi=0;
        for(int i=0;i< diziList.size() ; i++)
            if (diziList.get(i) >= ort)
                gecenSayisi++;

        return gecenSayisi;
    }
}

