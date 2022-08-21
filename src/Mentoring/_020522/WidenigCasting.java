package Mentoring._020522;

public class WidenigCasting {
    public static void main(String[] args) {
        // byte short char int lon 
        int sayi = 9;
        int sayi2 = 55;


        // Widening yani otomatik dönüşümlerde dönüşüm yönü genişleyen yönde olduğu için herhangi bir ikinci işleme gerek kalmaz.
        //bu nedenle otomatik dönüşüm olarak adlandırılır.
        
        long long2 = 35464;
        long longSayi = 67890658748564854L;
        double doubleDeger = 3.14;
        
        doubleDeger = sayi; // 
        System.out.println("doubleDeger = " + doubleDeger);

        long2 = sayi2;
        System.out.println("long2 = " + long2);
        
        
        
        
    }
}
