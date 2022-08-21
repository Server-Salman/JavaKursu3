package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Ben buraya(kursa) neden geldim ?

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize=");
        int vizeNotu=oku.nextInt();

        System.out.print("Final=");
        int finalNotu=oku.nextInt();

        // eğer sonucu double istiyorsak double eşitlemeliyiz.
        // eğer int istiyorsak int e eşitlemeliyiz.
        double ort= vizeNotu * 0.4 + finalNotu * 0.6;

        //int ortInt= (int)(vizeNotu * 0.4) + (int)(finalNotu * 0.6);

        if (ort >= 60){
            System.out.println("Geçtiniz, ort="+ort);
        }
        else{
            System.out.println("Kaldınız, ort="+ort);
        }

    }
}
