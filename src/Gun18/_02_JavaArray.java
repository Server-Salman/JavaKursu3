package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.print("cumle giriniz=");
        String cumle=oku.nextLine();

        int boslukSayisi=0;

        for(int i=0;i< cumle.length();i++) {
            if (cumle.charAt(i) == ' ')
                boslukSayisi++;
        }

        System.out.println("Kelime Sayisi = " + (boslukSayisi+1));
    }
}
