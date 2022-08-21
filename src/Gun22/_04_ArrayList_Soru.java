package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.
        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[6];

        for(int i=0;i< dizi.length ; i++)
        {
            System.out.print("Sayi=");
            dizi[i]=oku.nextInt();
        }

        // System.out.println(Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>();
        for(int i=0;i< dizi.length ; i++)
            if (dizi[i] %2==1)
               tekler.add(dizi[i]);

        System.out.println("tekler = " + tekler);

        // TODO : Ödev : tek elemanlarını ayrı diziye bir metodda atayarak main de yazdırınız.
        ArrayList<Integer> donenTekler=tekelemanlarAta(dizi);
        System.out.println("donenTekler = " + donenTekler);
    }

    public static ArrayList<Integer> tekelemanlarAta(int[] dizi){

        ArrayList<Integer> tekler=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++)
            if(dizi[i]%2==1)
                tekler.add(dizi[i]);

        return  tekler;


    }



}
