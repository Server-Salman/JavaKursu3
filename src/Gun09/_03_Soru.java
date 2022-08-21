package Gun09;

public class _03_Soru {
    public static void main(String[] args) {
        // 2022(dahil) yılına kadar geçen gun miktarınız bulunuz.

        int gecenGunMiktari= 2022*365 + (2022/4);
        System.out.println("gecenGunMiktari = " + gecenGunMiktari);

//        1  365
//        2  365
//        3  365
//        4  365     1  gün extra
//
//        2022*365  +   2022/4
    }
}
