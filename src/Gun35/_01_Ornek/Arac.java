package Gun35._01_Ornek;

public class Arac {
    private String renk;
    private int motor;
    private String marka;
    private int kapiSayisi;

    public Arac(String renk, int motor, String marka,int kapiSayisi) {
        setRenk(renk);
        setMotor(motor);
        setMarka(marka);
        setKapiSayisi(kapiSayisi);
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi <= 5 && kapiSayisi > 1)
            this.kapiSayisi = kapiSayisi;
        else {
            System.out.println("Kapı sayısı 5 den fazla olamaz");
            this.kapiSayisi=0;
        }
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", marka='" + marka + '\'' +
                '}';
    }
}
