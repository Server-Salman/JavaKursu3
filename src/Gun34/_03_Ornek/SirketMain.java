package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        Calisan cal1=new Calisan("ismet temur", 300, 3600);
        System.out.println("cal1.maasHesapla() = " + cal1.maasHesapla());
        System.out.println("cal1 = " + cal1);

        GenelMudur gm1=new GenelMudur("Halil Fındık", 300, 3600, 500000);
        System.out.println("gm1.maasHesapla() = " + gm1.maasHesapla());
        System.out.println("gm1 = " + gm1);

    }

}
