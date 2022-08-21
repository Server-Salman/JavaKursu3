package Gun27._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
        //         (properties, fields, özellik, eleman, items) : width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

        Rectangle r=new Rectangle();
        r.length=5;
        r.width=4;
        r.Cevre();
        r.Alan();

        // extra return gerekseydi main içinde
        int alan=r.Alan2();
        System.out.println("alan = " + alan);
    }

}
