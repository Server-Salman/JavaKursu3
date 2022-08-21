package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {
     // byte -> short -> char -> int -> long -> float -> double ; otomatik dönüşüm

      int sayi=9;
      long toplam=678;
      double oran = 3.2;

      oran = sayi;  // oran = 9 , kayıp olmadı
        // bu tip dönüşüme genişletilme yönünde olduğundan buna Widening Casting denir.
        // diğer adıyla herhangi bir ek işlem yapılmadığından otomatik dönüşüm denir.

      System.out.println("oran = " + oran);

      toplam = sayi;
      System.out.println("toplam = " + toplam);
    }
}
