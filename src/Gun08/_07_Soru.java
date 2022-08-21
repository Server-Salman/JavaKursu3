package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String cumle=oku.nextLine();

        int birinciBoslukIndex=cumle.indexOf(" ");
        int ikinciBoslukIndexi=cumle.indexOf(" ", birinciBoslukIndex+1);
        // boşluk ara ama benim verdiğim indexten sonra

        String ilk2Kelime= cumle.substring(0, ikinciBoslukIndexi);
        System.out.println("ilk2Kelime = " + ilk2Kelime);
    }
}
