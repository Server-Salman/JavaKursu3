package Gun15;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        for(int i=0; i < cumle.length(); i++){

            //bir karakter karşılaştırıyorsanız tek tırnak, birden fazla karakter olacaksa çift tırnak
            if (cumle.charAt(i) ==' ' ) continue;  // boşluk geldiğinde continue çalışır ve sonrakler pas geçilir, döngü devam eder

            System.out.println(cumle.charAt(i));
        }


    }
}
