package Gun31.FinalModifier.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo;// değiştirilemez
    // yani sadece 1 kez veri atama şansı var.

    static int tcNoSayac=1001;//bitanesin

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = ++tcNoSayac;
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken , ya da Constructor da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
