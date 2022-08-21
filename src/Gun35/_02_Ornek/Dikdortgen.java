package Gun35._02_Ornek;

public class Dikdortgen extends Sekil {
    private int uzunluk;
    private int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    @Override
    public double getAlan() {
      return this.genislik * this.uzunluk;
    }

    @Override
    public double getCevre() {
      return (this.genislik+this.uzunluk)*2;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    @Override
    public String toString() {
        return super.toString()+"Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}';
    }
}
