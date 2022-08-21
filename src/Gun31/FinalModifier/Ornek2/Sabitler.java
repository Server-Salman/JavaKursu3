package Gun31.FinalModifier.Ornek2;

public class Sabitler {

    final static int birGundekiSaatSayisi = 24;
    final static int birSaatdekiDakSayisi = 60;
    final static int birDakikadakiSanSayisi = 60;


    public static int hesapla(int gun, int saat, int dak){
        int toplamSaniye=
                gun * birGundekiSaatSayisi * birDakikadakiSanSayisi
                * Sabitler.birSaatdekiDakSayisi +
                saat * birSaatdekiDakSayisi * birDakikadakiSanSayisi +
                dak * birDakikadakiSanSayisi;

        return toplamSaniye;
    }

}
