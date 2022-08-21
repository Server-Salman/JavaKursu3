package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
       // girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String cumle=oku.nextLine();

        String ilkKelime=cumle.substring(0, cumle.indexOf(" "));

        System.out.println("ilk Kelime = " + ilkKelime);
    }
}
