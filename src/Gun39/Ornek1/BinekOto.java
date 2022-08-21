package Gun39.Ornek1;

public abstract class BinekOto {
    private String marka;
    private int uretimYili;
    private int vitesadedi;

    // implemente edilmek zorunda
    public abstract String getMarka();

    // ister override yapılabilir,
    // istenirse yapılmayabilir.
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesadedi() {
        return vitesadedi;
    }

    public void setVitesadedi(int vitesadedi) {
        this.vitesadedi = vitesadedi;
    }
}
