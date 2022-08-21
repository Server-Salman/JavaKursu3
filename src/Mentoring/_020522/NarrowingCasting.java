package Mentoring._020522;

public class NarrowingCasting {
    public static void main(String[] args) {
        
        int sayi = 55;
        long longSayi = 4854856485639475394L;  // Eğer Long ile bile handdle edilemiyosa değerler BigInteger gibi bazı çözümler ortaya çıkıyor.

        //Narrowing casting'de dönüşüm yaparken yeni değeri alacak olan değişken tipinde bir onaylama işlemi yapılduğı için (int) buna manuel değişim denir


        int sayi2 = 15;
        long long2 = 74658746568768768L;

        sayi2=(int)long2;
        sayi = (int) longSayi;

        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi = " + sayi);
        
        
    }
}
