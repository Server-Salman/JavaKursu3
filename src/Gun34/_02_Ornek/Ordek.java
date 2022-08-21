package Gun34._02_Ornek;

public class Ordek extends Hayvan{ // baba, babanın herseyini miras aldı. 3 dükkan
    int kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi);  // super üst Class ı gösteriyor yani Hayvan ı gösteriyor
        this.kanatAcikligi=kanatAcikligi;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak dedi");
    }

    @Override
    public String toString() {
        return "Ordek{" +
                "kanatAcikligi=" + kanatAcikligi +
                '}' + super.toString();
    }
}
