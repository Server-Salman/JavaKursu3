package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // Ornek Soru : yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
        // alan= pi*r*r    cevre = 2*pi*r      pi=3.14

        float PI=3.14F;
        int yaricap=5;

        float cevre= 2*PI*yaricap;
        float alan = PI*yaricap*yaricap;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
