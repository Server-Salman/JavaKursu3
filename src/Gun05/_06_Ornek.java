package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz.
        // cevre=a+a+a+a    alan =a*a

        Scanner oku= new Scanner(System.in);
        System.out.print("Kenar uzunluğu=");
        int kenar=oku.nextInt();

        int alan= kenar*kenar;
        int cevre= 4*kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
