package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar sayı tutulsun = ");
        int kacaKadarRandomSayi=oku.nextInt();
        
        int tutulanSayi=  (int)(Math.random() * kacaKadarRandomSayi);

        System.out.print("Tahmininz = ");
        int tahmin=oku.nextInt();
        
        // 1.Yöntem
        if (tutulanSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedinki bilemedinki");
        
        //.Yöntem
        System.out.println( ((tutulanSayi == tahmin) ? "Tebrikler" : "bilemedinki bilemedinki")  );

        System.out.println("tutulanSayi = " + tutulanSayi);
    }
}
