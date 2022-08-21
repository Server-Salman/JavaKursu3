package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız,
        // değer atayınız, sonra double değişkeni short değişkene çevirerek,
        // bütün değerleri ekrana yazdırınız.

        double oran=3.14;
        short kisa=2;

        System.out.println("once kisa = " + kisa);  // atamadan once
        kisa = (short)oran;
        System.out.println("sonra kisa = " + kisa); //4000

        System.out.println("oran = " + oran); //4000.4567
    }
}
