package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi; // daha önce değişkeni bu şekilde tanımlıyorduk. 1 tane yer açtı
        int[] dizi1=new int[5]; // 0,1,2,3,4  indexli 5 adet sayılık yer açtı hafızada

        System.out.println("dizi1.length = " + dizi1.length);

        Scanner oku=new Scanner(System.in);
        for(int i=0;i<dizi1.length;i++)
        {
            System.out.print("Sayi giriniz=");
            dizi1[i]=oku.nextInt();
        }

        System.out.println("dizi[4] = " + dizi1[4]);
    }
}
